package module4FiguresV3;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        ShapeUtil shape = new ShapeUtil();
        Figure figure = shape.readConsole();

        double calc = figure.calc();
        System.out.println(calc);
    }
}