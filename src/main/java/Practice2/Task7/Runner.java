package Practice2.Task7;

public class Runner {

    public static String sumBinaryNumbers(String number) {

        String[] inputValue = number.split(",");

        int sumDec = Integer.parseInt(inputValue[0], 2) + Integer.parseInt(inputValue[1], 2);

        String sumBinary = Integer.toBinaryString(sumDec);

        return sumBinary;
    }

    public static void main(String[] args) {

        String result = sumBinaryNumbers("101,100");
        System.out.println(result);
    }
}
