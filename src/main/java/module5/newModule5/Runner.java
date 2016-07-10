package module5.newModule5;

import java.util.Arrays;

import static module5.newModule5.ArrayUtils.max;
import static module5.newModule5.ArrayUtils.min;
import static module5.newModule5.ArrayUtils.s;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Выберите метод создания массива: 1 - автоматически, 2 - ручной ввод");
        int a = ArrayUtils.s.nextInt();
        switch (a) {
            case 1:
                System.out.println("Элементы массива: " + Arrays.toString(ArrayUtils.inputArrayListAuto()));
                System.out.println("Минимальное значение: " + ArrayUtils.min + " , " + "Максимальное значение: "
                        + ArrayUtils.max + ".");
                System.out.println("Отсортированный массив - " + Arrays.toString(ArrayUtils.sortCopyArray()));
                System.out.println(Arrays.toString(ArrayUtils.array));
                break;
            case 2:
                System.out.println("Элементы массива: " + Arrays.toString(ArrayUtils.inputArrayListManually()));
                System.out.println("Минимальное значение: " + ArrayUtils.min + " , " + "Максимальное значение: "
                        + ArrayUtils.max + ".");
                System.out.println("Отсортированный массив - " + Arrays.toString(ArrayUtils.sortCopyArray()));
                break;
        }
    }
}