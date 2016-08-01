 package Practice1.Task6;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
       int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9 ,10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
       };
        int y=0;
        int k=0; //steps
        int x = 0;
        int size = matrix.length;
        int[] matrixNew = new int[size*size];
        int index = 0; // index in newmatrix

        if ((size%2) == 0){
            k=size/2;
        } else {
            k=size/2 + 1;
        }

        int c; // number of cycles
        for (c = 0; c < k; c++) {
            x=x+c;
            for (y=y+c; y < size-c; y++) {
                matrixNew[index] = matrix[x][y];  // >
                System.out.println(matrixNew[index]);
                index++;

                }
            y=y-1;
                for (x = size-(size-1-c); x < size-c; x++) {  // vniz
                matrixNew[index] = matrix[x][y];
                System.out.println(matrixNew[index]);
                index++;
             }
             x = x-1;
                for (y = size-2-c; y>=0; y--) {   //<
                matrixNew[index] = matrix[x][y];
                System.out.println(matrixNew[index]);
                index++;
             }
            y=y+1;
            for (x = size - 2; x >0; x--) {     //^
                matrixNew[index] = matrix[x][y];
                System.out.println(matrixNew[index]);
                index++;
             }
        }
        System.out.println(Arrays.toString(matrixNew));
    }
}

