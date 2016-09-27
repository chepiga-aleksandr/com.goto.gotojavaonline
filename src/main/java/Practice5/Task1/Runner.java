package Practice5.Task1;

import java.util.ArrayList;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {

        String inputValue = "abcabc";

        String substring1, substring2;
        int length = inputValue.length();

        int[] period = new int[1];

        for (int i = 0; i <= length / 2; i++) {

            for (int j = 1; j < length - i; j++) {

                substring1 = inputValue.substring(0, i + 1);

                if ((substring1.length() * j + substring1.length()) >= length || substring1.length() > length - substring1.length()*2 ) {
                    break;
                } else {
                substring2 = inputValue.substring(substring1.length() * j, substring1.length() * j + substring1.length());
                }

                if (!substring1.equals(substring2)) {
                    period[0] = 1;
                    break;
                } else {
                   period[0] = substring1.length();
                }
            }
        }
        if (period.length == 0) {
            System.out.println(1);
        } else {
            System.out.println(period[0]);
        }
    }
}



