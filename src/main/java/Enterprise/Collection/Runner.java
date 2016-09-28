package Enterprise.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        System.out.println(addList(arrayList, 1000));
        System.out.println(addList(arrayList, 100000));
        System.out.println(addList(arrayList, 1000000));

        LinkedList linkedList = new LinkedList();

        System.out.println(getList(arrayList, 1000));
        System.out.println(getList(arrayList, 100000));
        System.out.println(getList(arrayList, 1000000));

    }

    private static long addList(List list, int size) {

        long timeConsumed = 0;

        long result = 0;

        for (int i = 0; i <= 100; i++) {

            long start = System.nanoTime();

            for (int j = 0; j < size; j++) {

                list.add(j);
            }

            long finish = System.nanoTime();

            timeConsumed = finish - start;

            result = result + timeConsumed;

            list.clear();

        }
        return timeConsumed;
    }


    private static long getList(List list, int size) {

        long timeConsumed = 0;

        long result = 0;

        for (int i = 0; i <= 100; i++) {

            long start = System.nanoTime();

            for (int j = 0; j < size; j++) {

                list.get(j);
            }

            long finish = System.nanoTime();

            timeConsumed = finish - start;

            result = result + timeConsumed;

            list.clear();

        }
        return timeConsumed;
    }
}