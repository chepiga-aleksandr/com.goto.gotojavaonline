package Practice2.Task5;

public class Runner {

    public static int returnAmountBits(String input) {

        StringBuilder numbers = new StringBuilder();
        int result = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '1') {
                numbers.append(i);
            }
        }
        result = numbers.length();
        return result;
    }

    public static void main(String[] args) {

        int numbersOgBits = returnAmountBits("110111101");

        System.out.println(numbersOgBits);
    }
}