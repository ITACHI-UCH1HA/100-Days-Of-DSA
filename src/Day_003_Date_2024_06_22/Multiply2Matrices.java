package Day_003_Date_2024_06_22;

import java.util.Arrays;

class Multiply2Matrices {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };
        int[][] matrix= multiply2Matrices(matrix1, matrix2);

        for(int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int[][] multiply2Matrices(int[][] matrix1, int[][] matrix2) {
        int m= matrix1.length;
        int n= matrix2[0].length;
        int[][] matrix= new int[m][n];

        for (int i = 0; i < m; i++) {
            int sum=0;
            for (int j = 0; j < n; j++) {
                sum+= matrix1[i][j]*matrix2[j][i];
            }
        }
        return matrix;
    }
}
