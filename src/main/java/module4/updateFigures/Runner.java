package module4.updateFigures;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Выберите фигуру для расчета площади: 1-Треугольник, 2-Прямоугольник, 3-Круг");

        int choice = InputFromConsole.readChoice();
        if (choice == 1) {
            Enum figure = Enum.Triangle;
            System.out.println("Введите размер основания и высоты треугольника: ");
            double result = figure.calculateArea();
// Copy and Paste Programming:
            System.out.println("Площадь - " + result);

        } else if (choice == 2) {
            Enum figure = Enum.Rectangle;
            System.out.println("Введите размер основания и высоты прямоугольника: ");
            double result = figure.calculateArea();
// Copy and Paste Programming:
            System.out.println("Площадь - " + result);

        } else if (choice == 3) {
            Enum figure = Enum.Circle;
            System.out.println("Введите радиус круга ");
            double result = figure.calculateArea();
// Copy and Paste Programming:
            System.out.println("Площадь - " + result);
        }
    }
}

