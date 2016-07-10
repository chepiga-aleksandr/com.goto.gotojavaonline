package module5;

public class FindMinMaxElement {

    public static void main(String[] args) {
        int[] intArray = {5, 1, 7, -8, 3, 17, 9, 4, -9, 2, 15, 56, 29};
        int max = intArray[0];
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        System.out.println("max = " + max + ";min = " + min);
    }
}
