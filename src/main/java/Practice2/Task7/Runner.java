package Practice2.Task7;

public class Runner {

    public static String sumBinaryNumbers(String number1, String number2) {

        int numberInt1 = Integer.parseInt(number1,2);

        int numberInt2 = Integer.parseInt(number2,2);

        int sumDec = numberInt1 + numberInt2;

        String sumBinary = Integer.toBinaryString(sumDec);

        return sumBinary;
    }

    public static void main(String[] args) {

        String result = sumBinaryNumbers("101", "100");
        System.out.println(result);
    }
}
