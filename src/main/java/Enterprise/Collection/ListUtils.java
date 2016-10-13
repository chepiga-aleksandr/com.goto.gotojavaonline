package Enterprise.Collection;

import Enterprise.Collection.Enterprise;

import java.util.List;
import java.util.Random;

public class ListUtils {

    public static Random random = new Random();

    public static long addList(List list, int size) {
        long timeConsumed;
        long result = 0;
        long start = System.nanoTime();
        for (int j = 0; j < size; j++) {
            list.add(j);
        }
        long finish = System.nanoTime();
        timeConsumed = finish - start;
        result = result + timeConsumed;

        return result / size;
    }

    public static long getList(List list, int size) {
        long result;
        long start = System.nanoTime();
        list.get(random.nextInt(size));
        long finish = System.nanoTime();
        result = finish - start;
        return result;
    }

    public static long removeList(List list, int size) {
        long result;
        long start = System.nanoTime();
        list.remove(random.nextInt(size));
        long finish = System.nanoTime();
        result = finish - start;
        return result;
    }

    public static long containsList(List list, int size) {
        long result;
        long start = System.nanoTime();
        list.contains("random.nextInt(size)");
        long finish = System.nanoTime();
        result = finish - start;
        return result;
    }

    public static long ListIteratorAdd(List list, int size) {

        java.util.ListIterator listIterator = list.listIterator();

        long result;
        long start = System.nanoTime();
        listIterator.add(random.nextInt(size));
        long finish = System.nanoTime();
        result = finish - start;
        return result;
    }

    public static long ListIteratorRemove(List list) {

        java.util.ListIterator listIterator = list.listIterator();

        long result = 0;
        long start = System.nanoTime();

        if (listIterator.hasNext()) {
            listIterator.next();
            listIterator.remove();
        } else {
            listIterator.hasPrevious();
            listIterator.remove();
        }
        long finish = System.nanoTime();
        result = finish - start;
        return result;
    }
    public static void clearList(List list) {
        list.clear();
    }
}

