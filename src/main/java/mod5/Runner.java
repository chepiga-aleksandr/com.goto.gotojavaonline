package mod5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    static int size;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите метод создания массива: 1 - автоматический, 2 - ручной ввод");
        int variant = scanner.nextInt();
        switch (variant) {
            case 1:
                System.out.println("Ведите размер массива: ");
                size = scanner.nextInt();

                int[] autoArray = inputArrayListAuto();

                autoArray = ArrayUtils.sortCopyArray(autoArray);
                System.out.println("Отсортированный массив:" + Arrays.toString(autoArray));

                MinMaxPair minMaxPair = ArrayUtils.minMaxPair(autoArray);
                System.out.println("Максимальное значение массива: " + minMaxPair.getMax() +
                        ", Минимальное значение массива: " + minMaxPair.getMin());
                break;
            case 2:
                System.out.println("Ведите размер массива: ");
                size = scanner.nextInt();

                int[] manuallyArray = inputArrayListManually();

                manuallyArray = ArrayUtils.sortCopyArray(manuallyArray);
                System.out.println("Отсортированный массив:" + Arrays.toString(manuallyArray));

                MinMaxPair minMaxPair1 = ArrayUtils.minMaxPair(manuallyArray);
                System.out.println("Максимальное значение массива: " + minMaxPair1.getMax() +
                        ", Минимальное значение массива: " + minMaxPair1.getMin());
                break;
        }
    }

    static int[] inputArrayListAuto() {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Элементы массива: " + Arrays.toString(array));
        return array;
    }

    static int[] inputArrayListManually() {
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Элементы массива: " + Arrays.toString(array));
        return array;
    }
}
