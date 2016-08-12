package Practice4;

public class Runner1 {

    public static void main(String[] args) {

        int l = 6;
        int sum = 0;
        int r = 3;
        int y = 2;
        int w = 1;
        int count = 0;

        int k = l / r;
        int m = l / y;
        int o = l / w;

        for (int i = 0; i < l; i++) {
            sum = l;
            if (l >= r) {
                sum = sum - r * i;
            } else continue;

            if (sum == 0) {
            count++;
            } else continue;

            for (int j = 0; j < m; j++) {

                if (sum > y) {

                    sum = sum - r * i;

                } else continue;

                sum = sum - y * j;
                if (sum == 0) {

                }
                for (int g = 1; g <= o; g++) {

                    sum = sum - g * w;

                    if (sum != 0) {
                        l = sum;
                    } else {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
