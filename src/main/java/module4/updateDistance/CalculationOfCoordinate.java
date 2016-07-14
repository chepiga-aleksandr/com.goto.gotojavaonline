package module4.updateDistance;

public class CalculationOfCoordinate {
    private static double x1, x2, y1, y2, result;

    public static double getX1() {
        return x1;
    }

    public static void setX1(double x1) {
        CalculationOfCoordinate.x1 = x1;
    }

    public static double getX2() {
        return x2;
    }

    public static void setX2(double x2) {
        CalculationOfCoordinate.x2 = x2;
    }

    public static double getY1() {
        return y1;
    }

    public static void setY1(double y1) {
        CalculationOfCoordinate.y1 = y1;
    }

    public static double getY2() {
        return y2;
    }

    public static void setY2(double y2) {
        CalculationOfCoordinate.y2 = y2;
    }

    public static double resultOgCalc() {
        result = Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY2() - getY1()), 2));
        return result;
    }
}
