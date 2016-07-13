package module4.updateFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {

        ShapeUtil shape = new ShapeUtil();
        Figure figure1 = shape.readConsole();

        double calc = figure1.calc();
        System.out.println(calc);
    }
}
