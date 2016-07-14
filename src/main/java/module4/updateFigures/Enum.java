package module4.updateFigures;

public enum Enum {
    Triangle {
        double calculateArea() {
            double width = InputFromConsole.readValue();
            double height = InputFromConsole.readValue();
            return 0.5 * width * height;
        }
    },
    Rectangle {
        double calculateArea() {
            double width = InputFromConsole.readValue();
            double height = InputFromConsole.readValue();
            return width * height;
        }
    },
    Circle {
        double calculateArea() {

            double radius = InputFromConsole.readValue();
            return Math.PI * radius * radius;
        }
    };

    abstract double calculateArea();
}
