package ua.goit.goitonline.module4;

public class Figures {
    public static void main(String[] args) {

    int width = 6, height = 7, radius =3; double area;

    area = (width * height) / 2;

    System.out.println("Площадь треугольника " + area);

    area = width * height;

    System.out.println("Площадь прямоугольника " + area);

    area = (int) (Math.PI * radius * radius);

    System.out.println("Площадь круга " + area);
    }
}
