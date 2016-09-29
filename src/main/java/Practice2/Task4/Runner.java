package Practice2.Task4;

public class Runner {

    public static void main(String[] args) {

        int x = convertStringForInt("GAGA");
        System.out.println(x);
    }

    public static int convertStringForInt(String stringInput) {

        String BASEOFLETTERS = "abcdefghij";

        StringBuilder numbers = new StringBuilder();

        int result;

        for (int i = 0; i < stringInput.length(); i++) {
            numbers.append(BASEOFLETTERS.indexOf(stringInput.toLowerCase().charAt(i)));
        }

        result = Integer.parseInt(numbers.toString());

        return result;
    }
}


