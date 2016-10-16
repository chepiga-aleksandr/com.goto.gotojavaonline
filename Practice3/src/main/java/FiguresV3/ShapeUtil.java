package FiguresV3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ShapeUtil {

    public static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

    public Figure readConsole() throws IOException {

        System.out.println("Please enter type of Figure (Rectangle, Triangle, Circle) or enter Quit for exit: ");

        String selection = BUFFERED_READER.readLine();
        String[] split;
        switch (selection) {
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                split = readParams(rectangle);

                Double height = Double.parseDouble(split[0]);
                Double weight = Double.parseDouble(split[1]);

                rectangle.setHeight(height);
                rectangle.setWeight(weight);
                return rectangle;
            case "Triangle":
                Triangle triangle = new Triangle();
                split = readParams(triangle);

                Double height1 = Double.parseDouble(split[0]);
                Double weight1 = Double.parseDouble(split[1]);

                triangle.setHeight(height1);
                triangle.setWeight(weight1);

                return triangle;
            case "Circle":
                Circle circle = new Circle();
                split = readParams(circle);
                Double radius = Double.parseDouble(split[0]);
                circle.setRadius(radius);
                return circle;
            case "Quit":
                System.exit(1);
            default:
                readConsole();
        }
        return null;
    }

    private String[] readParams(Figure figure) throws IOException {
        System.out.println(figure);
        String inputValue = BUFFERED_READER.readLine();
        return inputValue.split(",");
    }
}


