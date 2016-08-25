package Practice4.Task1;

public class Runner {
    public static void main(String[] args) {
        int n = 10;
        int w = 1;
        int y = 2;
        int r = 3;
        int count = 0;

        for (int i = 0; ; i++) {
            int l = r * i;

            if (l == n) {
                count++;
                break;
            }

            if (l > n) {
                break;
            }

            for (int j = 0; ; j++) {
                l = r * i + y * j;

                if (l == n) {
                    count++;
                    break;
                }

                if (l > n) {
                    break;
                }

                for (int g = 0; ; g++) {
                    l = r * i + y * j + w * g;

                    if (l == n) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
