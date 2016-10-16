package Task2;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[] vvp = {1, 3, 2, 2, 9, 7, 9, 3, 4, 7, 3, 7, 8, 9, 9};

        int[] result = new int[vvp.length];

        int count = 1;

        for (int i = 0; i < vvp.length - 1; i++) {

            if ((Math.abs(vvp[i] - vvp[i + 1])) <= 1) {
                result[i] = count;
                count++;
                continue;
            }
            count = 1;
        }
        Arrays.sort(result);

        System.out.println(result[result.length - 1]);
    }
}