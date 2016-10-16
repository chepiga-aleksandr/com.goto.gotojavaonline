package Task2;

public class Runner {
    public static void main(String[] args) {

        int a = 4, b = 7;
        if (a > 0 && b > 0) {
            calculate(a, b);
        } else {
            System.out.println("Входные данные некорректны");
        }
    }

    private static void calculate(int a, int b) {

        double numbers = a % 2 + b % 2;
        double result = a / 2 + b / 2;
        result = result + numbers / 2;

        System.out.println(result);
    }
}