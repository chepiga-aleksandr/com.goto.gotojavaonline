package module5.module5V2;

import java.util.Arrays;

public class ArrayUtils {
    public static MinMaxPair minMaxPair(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return new MinMaxPair(min, max);
    }

    public static int[] sortCopyArray(int[] array) {
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}

