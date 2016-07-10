package module5.newModule5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {

    public static int min, max, size;
    public static int[] array;
    public static Scanner s = new Scanner(System.in);

    private static int[] createArray() {
        System.out.println("Введите размер массива: ");
        size = s.nextInt();
        return new int[size];
    }

    static int[] inputArrayListAuto() {
        //int[] arrayAuto = createArray();
        array = createArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        minMaxPair(array);
        return array;
    }

    static int[] inputArrayListManually() {

        array = createArray();
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        minMaxPair(array);
        return array;
    }

    static void minMaxPair(int array[]) {
        max = array[0];
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
    }

    static int[] sortCopyArray() {

        int[] sortedArray = (int[])array.clone();

//        int[] sortedArray = Arrays.copyOf(array, size);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
