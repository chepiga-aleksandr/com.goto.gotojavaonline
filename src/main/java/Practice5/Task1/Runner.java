package Practice5.Task1;

import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {

        String inputValue = "abcab";

        TreeSet<Integer> period = new TreeSet<>();

        for (int i = 0; i < inputValue.length() / 2; i++) {

            String substring1 = inputValue.substring(0, i + 1);
            String substring2 = inputValue.substring(i + 1, 2 * (i + 1));

            if (substring1.equals(substring2)) {
                period.add(substring1.length());
            }
        }
        System.out.println(period.first());
    }
}



