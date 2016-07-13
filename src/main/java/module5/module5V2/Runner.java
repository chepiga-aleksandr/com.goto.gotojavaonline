package module5.module5V2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {
     public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите метод создания массива: 1 - автоматический, 2 - ручной ввод");

        int sw = scanner.nextInt();
        switch (sw) {
            case 1:
                System.out.println("Ведите размер массива: ");

                int[] autoArray = inputArrayListAuto();

                autoArray = ArrayUtils.sortCopyArray(autoArray);
                System.out.println("Отсортированный массив:" + Arrays.toString(autoArray));

                MinMaxPair minMaxPair = ArrayUtils.minMaxPair(autoArray);
                System.out.println(minMaxPair);
                break;
            case 2:
                System.out.println("Ведите размер массива: ");

                int[] manuallyArray = inputArrayListManually();
                manuallyArray = ArrayUtils.sortCopyArray(manuallyArray);
                System.out.println("Отсортированный массив:" + Arrays.toString(manuallyArray));

                MinMaxPair minMaxPair1 = ArrayUtils.minMaxPair(manuallyArray);
                System.out.println(minMaxPair1);
                break;
        }
    }

    static int[] inputArrayListAuto() {
        int[] array = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Элементы массива: " + Arrays.toString(array));
        return array;
    }

    static int[] inputArrayListManually() {
        int[] array = new int[scanner.nextInt()];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Элементы массива: " + Arrays.toString(array));
        return array;
    }
}
