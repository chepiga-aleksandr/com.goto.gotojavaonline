package Practice4.Task1;

public class Runner1 {
    public static void main(String[] args) {
        int n = 10;

        int w = 1;
        int y = 2;
        int r = 3;
        int count = 0;
        int l = 0;
        int i = 0;
        int j = 0;
        int g = 0;

        for (; ; ) {
            if(n < r) {
                break;
            }
            if (l == n) {
                count++;
                break;
            } else {
                l = r * i;
                i++;
            }
        }
        System.out.println(count);
    }
}


