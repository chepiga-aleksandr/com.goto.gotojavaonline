package Practice1.Task3;

public class Runner {

    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 2, -4, -6, -8};
        for (int i = 0; i <= arr.length; i++) {
            try {
                if ((arr[i] % 2) != 0) {
                    System.out.print("Number -" + arr[i] + ", its index :" + i);
                    break;
                }
            } catch (Exception e) {
                System.out.println(-1);
            }
        }
    }
}