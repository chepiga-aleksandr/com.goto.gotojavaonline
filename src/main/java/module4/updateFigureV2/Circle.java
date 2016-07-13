package module4.updateFigureV2;

import java.io.IOException;

public class Circle {

    public static double calcCircle() throws IOException {

        System.out.println("Введите параметры круга: радиус");

        double radius = Runner.sc.nextDouble();

        System.out.println();
        double result = Math.PI * radius * radius;
        return result;
    }
}

