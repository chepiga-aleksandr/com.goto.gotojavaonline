package module6;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.zip.DataFormatException;

import static module4.updateDistance.InputFromConsole.sc;

public class Runner {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите метод создания массива: 1 - автоматический, 2 - ручной ввод");

        String sw = scanner.next();
        int ch = 0;

        try {
            ch = Integer.parseInt(sw);
            System.out.println("Вы выбрали вариант - " + ch);
        } catch (NullPointerException ex) {
            System.out.println("Вариант выбора может быть только цифрой (порядковым номером варианта создания массива");
        }

        if (ch == 1) {
            System.out.println("Ведите размер массива: ");

            int[] autoArray = inputArrayListAuto();

            autoArray = ArrayUtils.sortCopyArray(autoArray);
            System.out.println("Отсортированный массив:" + Arrays.toString(autoArray));

            MinMaxPair minMaxPair = ArrayUtils.minMaxPair(autoArray);
            System.out.println(minMaxPair);
        } else if (ch == 2) {
            System.out.println("Ведите размер массива: ");

            int[] manuallyArray = inputArrayListManually();

            manuallyArray = ArrayUtils.sortCopyArray(manuallyArray);
            System.out.println("Отсортированный массив:" + Arrays.toString(manuallyArray));

            MinMaxPair minMaxPair = ArrayUtils.minMaxPair(manuallyArray);
            System.out.println(minMaxPair);
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

        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Маcсив должен сосотоять из натуральных чисел!");
        }
        System.out.println("Элементы массива: " + Arrays.toString(array));
        return array;
    }
}

