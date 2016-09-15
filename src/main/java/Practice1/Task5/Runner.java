package Practice1.Task5;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21},
        };

        int size = matrix.length;

        int[] matrixNew = new int[size * size];

        int index = 0;
        int x, y;

        for (y = 0; y < size * size; y++) {

            for (x = 0; x < size; x++) {

                matrixNew[index] = matrix[x][y];
                index++;
            }
            y++;
            if (index == size * size) {
                break;
            }
            for (x = size - 1; x >= 0; x--) {

                matrixNew[index] = matrix[x][y];
                index++;
            }
        }
        System.out.println(Arrays.toString(matrixNew));
    }
}

