package Task1;

public class Runner {

    public static void main(String[] args) {

        String inputValue = "ab";

        String subString;

        int count = 0;

        for (int i = 1; i <= inputValue.length(); i++) {

            subString = inputValue.substring(0, i);

            for (int j = 0; j < inputValue.length() - 1; j++) {

                if (!(subString.length() <= inputValue.length() - (j + i))) {
                    break;
                }

                String sub = inputValue.substring(j + i, inputValue.length());

                boolean searchString = inputValue.startsWith(subString, j + i);

                if (!searchString) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}



