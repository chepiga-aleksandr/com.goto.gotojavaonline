package Task2;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        String input = "abcd";
        String output = "dkbc";
        char[] inputChars = input.toCharArray();
        char[] outputChars = output.toCharArray();
        char[] result = new char[outputChars.length];
        int length = inputChars.length;

        for (int counter = 1; counter < length; counter++) {
            int position = 0;
            int index = length;

            do {
                result[length - (length - position)] =
                        outputChars[index - 1 + position];
                position++;
                index = 0;
            } while (position < length);

            if (Arrays.equals(result, inputChars)) {
                System.out.println(counter);
                break;
            } else if (!Arrays.equals(result, inputChars) &
                    counter == inputChars.length - 1) {
                System.out.println(-1);
            } else {
                System.arraycopy(result, 0, outputChars, 0, length);
            }
        }
    }
}