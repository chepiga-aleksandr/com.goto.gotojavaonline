package Practice2.Task1;

public class Runner {
    private static String sumBase36(String input) {


        String BASEOFELEMENTS = "0123456789abcdefghijklmnopqrstuvwxyz";

        String[] inputValue = input.toLowerCase().split(",");

        long sum = 0;
        long count = 0;
        for (String element : inputValue) {
            for (char letter : element.toCharArray()) {
                for (int i = 0; i < (element.toCharArray()).length; i++) {
                    i = BASEOFELEMENTS.indexOf(letter);
                    count += i;
                    break;
                }
                count *= 36;
            }
            sum += count / 36;
            count = 0;
        }
        return Long.toString(sum, 36);
    }

    public static void main(String[] args) {
        System.out.println(sumBase36("AA,AA"));
    }
}
