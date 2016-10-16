package Generics;

public class IntegerTask implements Task<Integer> {

    private Integer value;

    public IntegerTask(Integer value) {
        this.value = value;
    }

    @Override
    public void execute() {
        value = value - 20;
    }

    @Override
    public Integer getResult() {
        return value;
    }
}

