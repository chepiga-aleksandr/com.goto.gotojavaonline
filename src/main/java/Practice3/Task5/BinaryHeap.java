package Practice3.Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BinaryHeap {

    private static ArrayList<Integer> binaryHeapArray = new ArrayList<>();

    public static List<Integer> buildHeap(int size) {

        Random random = new Random();
        for (int i = 0; i < size; i++) {

            binaryHeapArray.add(random.nextInt(size));
        }
        return binaryHeapArray;
    }

    public void insertValue(int value) {

        binaryHeapArray.add(value);

        int i = binaryHeapArray.size() - 1;

        int parent = (i - 1) / 2;

        while (i > 0 && binaryHeapArray.get(parent) < binaryHeapArray.get(i)) {

            int temp = binaryHeapArray.get(i);

            binaryHeapArray.add(binaryHeapArray.get(parent));

            binaryHeapArray.add(temp);

            i = parent;

            parent = (i - 1) / 2;

        }
    }

    private void heapify(int i) {

        int leftChild;
        int rightChild;
        int largestChild;
        int heapSize;


        for (; ; ) {

            leftChild = 2 * i + 1;
            rightChild = 2 * i + 2;
            largestChild = i;
            heapSize = 10;

            if (leftChild < heapSize && binaryHeapArray.get(leftChild) > binaryHeapArray.get(largestChild)) {
                largestChild = leftChild;
            }
            if (rightChild < heapSize && binaryHeapArray.get(rightChild) > binaryHeapArray.get(largestChild)) {
                largestChild = rightChild;
            }

            if (largestChild == i) {
                break;
            }

            int temp = binaryHeapArray.get(i);
            binaryHeapArray.add(binaryHeapArray.get(largestChild));
            binaryHeapArray.add(temp);
            i = largestChild;
        }
    }

    public static void main(String[] args) {

        BinaryHeap binaryHeap = new BinaryHeap();

        binaryHeap.binaryHeapArray = (ArrayList<Integer>) buildHeap(10);

        System.out.println(binaryHeapArray);

        binaryHeap.insertValue(34);

        System.out.println(binaryHeapArray);

    }
}
