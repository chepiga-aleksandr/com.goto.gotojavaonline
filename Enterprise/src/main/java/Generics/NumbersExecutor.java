package Generics;

import java.util.ArrayList;
import java.util.List;

public class NumbersExecutor implements Executor<Number>{

    private List<Task<? extends Number>> taskList = new ArrayList<>();
    private List<Number> valid = new ArrayList<>();
    private List<Number> invalid = new ArrayList<>();
    private boolean executeCalled = false;

    @Override
    public void addTask(Task<? extends Number> task) throws ExecuteCalledException {
        if (executeCalled) throw new ExecuteCalledException("Execute method called");
        taskList.add(task);
    }

    @Override
    public void addTask(Task<? extends Number> task, Validator<? super Number> validator) throws ExecuteCalledException {
        if (executeCalled) throw new ExecuteCalledException("Execute method called");
        task.execute();
        Number result = task.getResult();

        if (validator.isValid(result)) {
            valid.add(result);
        } else {
            invalid.add(result);
        }
    }

    @Override
    public void execute() {
        NumbersValidator validator = new NumbersValidator();

        for (Task<? extends Number> task : taskList) {
            task.execute();

            Number result = task.getResult();

            if (validator.isValid(result)) {
                valid.add(result);
            } else {
                invalid.add(result);
            }
        }

        executeCalled = true;
    }

    @Override
    public List<? extends Number> getValidResults() throws ExecuteNotCalledException {
        if (!executeCalled) throw new ExecuteNotCalledException("Execute method not called");
        return valid;
    }

    @Override
    public List<? extends Number> getInvalidResults() throws ExecuteNotCalledException {
        if (!executeCalled) throw new ExecuteNotCalledException("Execute method not called");
        return invalid;
    }
}

