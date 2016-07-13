package module4.updateFigureV2;

import java.io.IOException;

public class Rectangle {

    double height, widht, result;

    public static void calcRectangle() throws IOException {

        System.out.println("Введите параметры прямоугольника: ширина, высота");

        double height = Runner.sc.nextDouble();
        double width = Runner.sc.nextDouble();
        Cal

        double result = height * width;

    }

    @Override
    public String toString() {

        return "Площадь треугольника равна: " + result;
    }
}




