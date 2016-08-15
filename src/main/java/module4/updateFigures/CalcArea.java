package module4.updateFigures;

public class CalcArea {

    public static double getWidth() {
        return width;
    }

    public static double getHeight() {
        return height;
    }

    public static double getRadius() {
        return radius;
    }

    private static double width, height, radius;

    public static void setWidth(double width) {
        CalcArea.width = width;
    }

    public static void setHeight(double height) {
        CalcArea.height = height;
    }

    public static void setRadius(double radius) {
        CalcArea.radius = radius;
    }
}
