package Enterprise.Collection;

import java.util.Random;
import java.util.Set;

public class SetUtils {

    public static Random random = new Random();

    public static long addSet(Set set, int size) {
        long timeConsumed;
        long result = 0;
        long start = System.nanoTime();
        for (int j = 0; j < size; j++) {
            set.add(random.nextInt(size));
        }
        long finish = System.nanoTime();
        timeConsumed = finish - start;
        result = result + timeConsumed;
        return result / size;
    }

    public static long containsSet(Set set, int size) {
        long result;
        long start = System.nanoTime();
        set.contains(random.nextInt(size));
        long finish = System.nanoTime();
        result = finish - start;
        return result;
    }

    public static long removeSet(Set set, int size) {
        long result;
        long start = System.nanoTime();
        set.remove(random.nextInt(size));
        long finish = System.nanoTime();
        result = finish - start;
        return result;
    }

    public static void clearset(Set set) {
        set.clear();
    }
}

