package module5;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] intArray = {5, 1, 7, -8, 3, 17, 9, 4, -9, 2, 15, 56, 29};
        boolean swapOccurred = true;
        while (swapOccurred) {
            swapOccurred = false;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] < intArray[i + 1]) {
                    int tempElement = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = tempElement;
                    swapOccurred = true;
                }
            }
        }
//        For (int element : intArray) {
            System.out.println(Arrays.toString(intArray));
        }
    }



