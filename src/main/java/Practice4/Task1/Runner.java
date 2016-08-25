package Practice4.Task1;

public class Runner {

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

        for (i = 0; i < 100; i++) {
            l = r * i;
            if (l == n){
                count++;
                break;
            }

            if (l > n) {
                break;
            }

            for (j = 0; j < 100; j++) {

               l = r * i + y * j;
                if (l == n){
                    count++;
                    break;
                }
                if (l > n) {
                    break;
                }

                for (g = 0; g < 100; g++) {

                    if (l == n) {
                        count++;
                        break;
                    }
                    l = r * i + y * j + w * g;
                    if (l == n) {
                        count++;
//                        l = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
