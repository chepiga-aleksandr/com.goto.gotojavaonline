package Practice2.Task4;

public class Runner {

    public static void main(String[] args) {

        int x = convertStringForInt("gaga");
        System.out.println(x);
    }

    public static int convertStringForInt(String stringInput) {

        String BASEOFLETTERS = "abcdefghi";

        StringBuilder numbers = new StringBuilder();

        int result = 0;
        for (int i = 0; i < stringInput.length(); i++) {
            numbers.append(BASEOFLETTERS.indexOf(stringInput.charAt(i)));
        }

        result = Integer.parseInt(numbers.toString());

        return result;
    }
}


