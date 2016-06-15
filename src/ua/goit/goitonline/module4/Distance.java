package ua.goit.goitonline.module4;

public class Distance {
    public static void main(String[] args) {

        int coordinatex1 = 6, coordinatex2 = 12, coordinatey1 = 3, coordinatey2 = 5;
        double heightOfTheTriangle, baseOfTheTriangle, distance;

        baseOfTheTriangle = coordinatex2 - coordinatex1;
        heightOfTheTriangle = coordinatey2 - coordinatey1;
        distance = ( baseOfTheTriangle *  heightOfTheTriangle ) / 2;

        System.out.println("Расстояние между точками равно " + distance);

    }
}
