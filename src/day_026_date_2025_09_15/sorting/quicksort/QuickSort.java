package day_026_date_2025_09_15.sorting.quicksort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static int lomutoPartition(int[] nums, int l, int h) {
        int pivot = nums[h];
        int i = l-1;
        int j= l;

        for (; j < h; j++) {
            if(nums[j]<pivot){
                i++;
                swap(nums, j, i);
            }
        }

        swap(nums, ++i,h);

        return i;
    }

    public static void quickSort(int[] nums, int l, int h){
        if(l<h){
            int p = lomutoPartition(nums, l, h);
            quickSort(nums, l, p-1);
            quickSort(nums, p+1, h);
        }
    }
    public static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            // Move i forward
            do {
                i++;
            } while (arr[i] < pivot);

            // Move j backward
            do {
                j--;
            } while (arr[j] > pivot);

            // If pointers cross, return partition index
            if (i >= j)
                return j;

            swap(arr, i, j);

        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
