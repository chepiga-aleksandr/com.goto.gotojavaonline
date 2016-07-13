package module4.updateFigureV2;


import java.io.IOException;

public class Triangle {

    public static double calcTriangle() throws IOException {

        System.out.println("Введите параметры треугольника: ширина, высота");

        double height = Runner.sc.nextDouble();
        double width = Runner.sc.nextDouble();
        System.out.println();
        double result = height*width/2;
        return result;
    }
}
