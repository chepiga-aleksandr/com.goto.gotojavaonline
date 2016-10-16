package Multithreaded2;

public class Main {
    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SquareSum counter = new SquareSumImpl();
        Long result = counter.getSquareSum(value, 3);
        System.out.println("result" + result);
    }
}
