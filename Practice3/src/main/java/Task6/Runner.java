package Task6;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Integer[] gnome = {5, 7, 6, 9, 4};
        Integer[] food = {8, 5, 6, 2, 3};

        Integer[] gnomeCopy = gnome.clone();
        Integer[] foodCopy = food.clone();

        Arrays.sort(gnomeCopy);
        Arrays.sort(foodCopy);

        List gnomeList = Arrays.asList(gnome);
        List foodList = Arrays.asList(food);

        List gnomeSort = Arrays.asList(gnomeCopy);
        List foodSort = Arrays.asList(foodCopy);

        Integer[] result = new Integer[gnome.length];

        for (int i = 0; i < gnome.length; i++) {

            result[gnomeList.indexOf(gnomeSort.get(i))] = foodList.indexOf(foodSort.get(i));
        }
        System.out.println(Arrays.toString(gnome));
        System.out.println(Arrays.toString(food));
        System.out.println(Arrays.toString(result));
    }
}
