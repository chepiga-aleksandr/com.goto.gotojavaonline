package Practice2.Task6;

public class Runner {

    public static String replacedBit(String inputString, int x) {

        StringBuilder number = new StringBuilder(inputString);

        number.setCharAt(x, '0');

        return number.toString();
    }

    public static void main(String[] args) {

        String result = replacedBit("11111111", 3);

        System.out.println(result);
    }
}


