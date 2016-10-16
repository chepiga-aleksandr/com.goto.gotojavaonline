package Task3;

public class Runner {

    public static void main(String[] args) {
        int[] arr = {2, 6, 2, 2, -4, -6, -8};

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] % 2) != 0) {
                System.out.println("Number -" + arr[i] + ", its index :" + i);
                break;
            }
            if (i == arr.length-1) {
                System.out.println(-1);
            }
        }
    }
}