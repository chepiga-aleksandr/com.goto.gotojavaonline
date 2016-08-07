package Practice2.Task2;

public class Runner {

    public static void main(String[] args) {

        int a = 4, b = 7;
        int numbers = a % 2 + b % 2;
        int result = a / 2 + b / 2;
        result = result + numbers / 2;
        System.out.println(result);
    }
}