package Task1;

public class Runner1 {

    public static void main(String[] args) {
        String input = "ababv";

        boolean equal;
        int position = 1;
        int amountToTake = 1;
        int remember;

        do {
            equal = input.regionMatches(0, input, position, amountToTake);

            if (equal) {
                remember = amountToTake;
                position = position + amountToTake;
            } else {
                position++;
                amountToTake = position;
                remember = input.length();
            }

        } while (position < input.length());

        System.out.println(remember);
    }
}

