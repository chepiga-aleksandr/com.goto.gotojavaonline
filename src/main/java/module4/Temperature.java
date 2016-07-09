package module4;

public class Temperature {

    public static void main(String[] args) {

        double celsius = 10, fahrenheit = 59, result, coefficient = 1.8;

        result = (fahrenheit - 32) / 1.8;

        System.out.println("Температура в градусах Цельсия " + result);

        result = celsius*coefficient + 32;

        System.out.println("Температура в градусах Фаренгейта " + result);

    }
}






