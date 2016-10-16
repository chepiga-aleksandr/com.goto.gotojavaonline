package Task6;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36},
        };

        int y, k, x;

        int size = matrix.length;

        int[] matrixNew = new int[size * size];

        int index = 0;

        if ((size % 2) == 0) {
            k = size / 2;
        } else {
            k = size / 2 + 1;
        }

        int c;
        for (c = 0; c < k; c++) {
            x = c;
            for (y = c; y < size - c; y++) {
                matrixNew[index] = matrix[x][y];
                index++;

            }
            y = y - 1;
            for (x = size - (size - 1 - c); x < size - c; x++) {
                matrixNew[index] = matrix[x][y];
                index++;
            }
            x = x - 1;
            for (y = size - 2 - c; y >= 0 + c; y--) {
                matrixNew[index] = matrix[x][y];
                index++;
            }
            y = y + 1;
            for (x = size - 2 - c; x > 0 + c; x--) {
                matrixNew[index] = matrix[x][y];
                index++;
            }
        }
        System.out.println(Arrays.toString(matrixNew));
    }
}

