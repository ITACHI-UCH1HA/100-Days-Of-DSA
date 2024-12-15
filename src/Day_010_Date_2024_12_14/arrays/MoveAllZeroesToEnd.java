package Day_010_Date_2024_12_14.arrays;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushZerosToEnd_Efficient(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void pushZerosToEnd_Efficient(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }

        for (int i = count; i < n; i++) {
            arr[i] = 0;
        }
    }

    private static void pushZerosToEnd(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=0;
        while(i<n){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
    }

    public static void pushZerosToEnd_Naive(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        int i=0;
        int j=0;
        while(i<n){
            if(arr[i]!=0){
                temp[j] = arr[i];
                j++;
            }
            i++;
        }
        for (int k = 0; k < n; k++) {
            arr[k] = temp[k];
        }
    }
}
