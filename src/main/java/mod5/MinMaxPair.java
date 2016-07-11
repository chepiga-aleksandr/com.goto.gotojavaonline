package mod5;

import java.util.Arrays;

public class MinMaxPair {

    public static minMaxPair(int array[] double min, double max) {


        private max = array[0];
        private min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
    }

    public static void int[] sortCopyArray() {

        public static void sort(int[] a) {
                        array;
        }
        int[] sortedArray = (int[])array.clone();

//        int[] sortedArray = Arrays.copyOf(array, size);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

}
