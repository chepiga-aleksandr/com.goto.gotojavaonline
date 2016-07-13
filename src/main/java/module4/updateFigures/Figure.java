package module4.updateFigures;

abstract class Figure {
    public abstract String getFigureType();

    public abstract String getInitialParams();

    public abstract double calc();

    @Override
    public String toString() {
        return "Please Enter initial params (coma is delimiter) for" + getFigureType() + ",with next params"
                + getInitialParams() + ".";
    }
}