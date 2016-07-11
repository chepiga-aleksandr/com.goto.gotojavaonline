package mod5;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    static int size;
    static int[] array;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Выберите метод создания массива: 1 - автоматический, 2 - ручной ввод");
        int variant = sc.nextInt();
        switch (variant) {
            case 1:
                System.out.println("Ведите размер массива: ");
                size = sc.nextInt();
                inputArrayListAuto();
                break;
            case 2:
                System.out.println("Ведите размер массива: ");
                size = sc.nextInt();
                inputArrayListManually();
                break;
        }
    }

    static int[] inputArrayListAuto() {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Элементы массива: " + Arrays.toString(array));
        return array;
    }

    static int[] inputArrayListManually() {
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Элементы массива: " + Arrays.toString(array));
        return array;
    }
}
