package Practice5.Task1;

import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {

        String inputValue = "123456";

        String substring1, substring2 = null;
        int length = inputValue.length();


        TreeSet<Integer> period = new TreeSet<>();

        for (int i = 0; i <= length / 2; i++) {

            for (int j = 1; j < length - i; j++) {

                substring1 = inputValue.substring(0, i + 1);
                if ((substring1.length() * j + substring1.length()) > inputValue.length()) {
                    break;
                }

                if (substring1.length() * 2 <= length) {
                    substring2 = inputValue.substring(substring1.length() * j, substring1.length() * j + substring1.length());
                }

                if (substring1.equals(substring2)) {
                    period.add(inputValue.length());
                }
            }
        }
    }
}



