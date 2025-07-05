package day_026_date_2025_09_15.sorting.quicksort;

import java.util.Arrays;

public class HoarePartition {
    public static void main(String[] args) {
        int[] nums = {3,5,4,1,2,4};
        int index = hoarePartition(nums, 0, nums.length-1);
        System.out.println(index);
        System.out.println(Arrays.toString(nums));
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

            // Swap elements at i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    private static int hoarePartition(int[] nums) {
        int pivot = nums[0];
        int i=-1, j= nums.length;

        while (i<=j){
            do{
                i++;
            }while(nums[i]<pivot);
            do{
                j--;
            }while (nums[j]>pivot);
            if(i>=j){
                return j;
            }
            swap(nums, i, j);
        }
        return -1;
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//3,5,4,3,2,1
//1,5,4,3,2,3
//1,2,4,3,5,3
//1,2,3,4,5,3

//