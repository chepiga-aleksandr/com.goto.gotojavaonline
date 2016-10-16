package Generics;

public class NumbersValidator implements Validator<Number> {

    @Override
    public boolean isValid(Number value) {

        return value.doubleValue() >= 0;
    }
}
