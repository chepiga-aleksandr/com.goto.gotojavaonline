package Practice2.Task6;

public class Runner {

    public static String replacedBit(String inputString, int positionNumber, char symbol) {

        StringBuilder number = new StringBuilder(inputString);

        number.setCharAt(positionNumber, symbol);

        return number.toString();
    }

    public static void main(String[] args) {

        String result = replacedBit("11111111", 3, '0');

        System.out.println(result);
    }
}


