package Day_013_Date_2024_12_17.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            swap(arr, index, i);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
