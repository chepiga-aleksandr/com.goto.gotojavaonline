package Generics;

import java.util.Arrays;
import java.util.List;


public class Runner {

    public static void main(String[] args) throws ExecuteCalledException, ExecuteNotCalledException {

        Task<Float> floatTask1 = new FloatTask(5F);
        Task<Float> floatTask2 = new FloatTask(40F);

        List<Task<Float>> floatTasks = Arrays.asList(floatTask1, floatTask2);

        Executor<Number> numberExecutor = new NumbersExecutor();

        for (Task<Float> floatTask : floatTasks) {
            numberExecutor.addTask(floatTask);
        }

        numberExecutor.addTask(new IntegerTask(20), new NumbersValidator());

        numberExecutor.execute();

        //numberExecutor.addTask(new IntegerTask(20));

        System.out.println("valid results:");
        numberExecutor.getValidResults().forEach(System.out::println);

        System.out.println("invalid results:");
        numberExecutor.getInvalidResults().forEach(System.out::println);
    }
}

