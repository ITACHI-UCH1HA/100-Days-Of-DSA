package Day_003_Date_2024_06_25.Matrix;

import java.util.Arrays;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(searchIn2DMatrix_3(array, 9)));
    }

    private static int[] searchIn2DMatrix_3(int[][] array, int target) {
        return new int[]{};
    }

    private static int[] searchIn2DMatrix_2(int[][] array, int target) {
        int m= array.length;
        int n= array[0].length;
        int start=0, end= m*n-1;

        while(start<=end){
            int mid= start+(end-start)/2;
            int r=mid/n, c=mid%n;
            int num= array[r][c];

            if(num==target){
                return new int[]{r, c};
            }else if(num>target){
                end= mid-1;
            }else{
                start= mid+1;
            }
        }

        return new int[]{-1,-1};
    }

    private static int[] searchIn2DMatrix(int[][] array, int target) {
        int rlen= array.length;
        int clen= array[0].length;
        int row=0, col= clen-1;

        while(col>=0 && row<rlen){
            int num= array[row][col];
            if(num==target){
                return new int[]{row,col};
            }else if(num>target){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
