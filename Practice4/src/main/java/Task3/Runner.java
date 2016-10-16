package Task3;

public class Runner {

    public static void main(String[] args) {

        String inputValue = "-2.e10e";
        Double inputValueDouble;

        try {

            inputValueDouble = Double.valueOf(inputValue);
            System.out.println(inputValueDouble);

        } catch (NumberFormatException e){
            System.err.println("NULL");
        }
    }
}