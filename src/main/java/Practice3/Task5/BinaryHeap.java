package Practice3.Task5;

import java.util.ArrayList;

public class BinaryHeap {

    private ArrayList<Integer> binaryHeapArray;

    int heapSize;

    private BinaryHeap(int size) {

        binaryHeapArray = new ArrayList<>(size);
    }

    public void insert(int value) {

        binaryHeapArray.add(value);

        int i = binaryHeapArray.size() - 1;

        int parent = (i - 1) / 2;

        while (i > 0 && binaryHeapArray.get(parent) < binaryHeapArray.get(i)) {

            int temp = binaryHeapArray.get(i);

            binaryHeapArray.set(i, binaryHeapArray.get(parent));

            binaryHeapArray.set(parent, temp);

            i = parent;

            parent = (i - 1) / 2;

        }
    }

    private void heapify(int i) {

        int leftChild;
        int rightChild;
        int largestChild;


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
            binaryHeapArray.set(i, binaryHeapArray.get(largestChild));
            binaryHeapArray.set(largestChild, temp);
            i = largestChild;
        }
    }

    public int getMax() {
        int result = binaryHeapArray.get(0);
        binaryHeapArray.set(0, binaryHeapArray.get(heapSize - 1));
        binaryHeapArray.remove(heapSize - 1);
        return result;
    }

    public static void main(String[] args) {

        BinaryHeap binaryHeap = new BinaryHeap(10);

        binaryHeap.insert(20);
        binaryHeap.insert(11);
        binaryHeap.insert(15);
        binaryHeap.insert(6);
        binaryHeap.insert(9);
        binaryHeap.insert(7);
        binaryHeap.insert(8);
        binaryHeap.insert(1);
        binaryHeap.insert(3);
        binaryHeap.insert(5);

//        binaryHeap.binaryHeapArray.forEach(value -> System.out.println(value + " "));

binaryHeap.getMax();

//        System.out.println(binaryHeap.getMax());

        binaryHeap.heapify(0);

        System.out.println(binaryHeap);

        System.out.println();

    }
}

