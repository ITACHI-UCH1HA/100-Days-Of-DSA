package Day_014_Date_2024_12_18.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr, int left, int right){
        if(left<right){
            int mid = left+(right-left)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            //merge(arr, left, mid, right);
        }
    }
}
