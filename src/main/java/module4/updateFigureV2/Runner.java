package module4.updateFigureV2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Runner {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Выберите фигуру: 1 - Треугольник, 2 - Прямоугольник, 3-Круг");
        String sw = sc.nextLine();

        switch (sw) {
            case "1":
                Triangle.calcTriangle();
                System.out.println(return);
                break;
            case "2":
                Rectangle.calcRectangle();
                System.out.println(return);
                break;
            case "3":
                Circle.calcCircle();
                break;
        }
    }
}

