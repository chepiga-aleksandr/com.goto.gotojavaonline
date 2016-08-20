package Practice4.Task2;

public class Runner {

    public static void main(String[] args) {
        String inputValue = "fh6dg7jg3fgsdf6";

        StringBuilder word = new StringBuilder();

        int count = 0;

        for (int i = 0; i < inputValue.length(); i++) {

            char element = inputValue.charAt(i);

            if ((element > 64 && element < 91) ||
                    (element > 96 && element < 123)) {
                word.append(inputValue.charAt(i));
                if (i == inputValue.length() - 1) {
                    count++;
                }
            } else {
                word.delete(0, i);
                count++;
            }
        }
        System.out.println(count);
    }
}