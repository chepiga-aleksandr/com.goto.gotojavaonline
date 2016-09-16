package Practice5.Task1;

import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {

        String inputValue = "123456789";

        String substring1, substring2 = null;

        TreeSet<Integer> period = new TreeSet<>();

        for (int i = 0; i <= inputValue.length()/2; i++) {

            for (int j = 1; j < inputValue.length()-i; j++) {

                substring1 = inputValue.substring(0, i + 1);

                if (substring1.length()*2 < inputValue.length()) {
                    substring2 = inputValue.substring(substring1.length() * j, substring1.length() * j + substring1.length());
                }
    //            String str = substring2;
             if (substring1.equals(substring2)) {
            period.add(substring1.length());
             }
            }
        }
//       System.out.println(period.first());
    }
}



