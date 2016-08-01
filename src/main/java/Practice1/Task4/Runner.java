package Practice1.Task4;

public class Runner {

    public static void main(String[] args) {
        int[] arr = {1, 24, 2, -9, 6, 0, 3, 6};
        int max = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        System.out.println("Max number - " + max);
    }
}
