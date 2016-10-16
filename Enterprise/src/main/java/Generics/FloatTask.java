package Generics;

public class FloatTask implements Task<Float> {

    private Float value;

    public FloatTask(Float value) {
        this.value = value;
    }

    @Override
    public void execute() {
        value = value - 10;
    }

    @Override
    public Float getResult() {
        return value;
    }
}