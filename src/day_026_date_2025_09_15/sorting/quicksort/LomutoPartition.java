package day_026_date_2025_09_15.sorting.quicksort;

import java.util.Arrays;

public class LomutoPartition {
    public static void main(String[] args) {
        int[] nums = {9, 3, 7, 6, 2, 8};
        lomutoPartition(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void lomutoPartition(int[] nums) {
        int l = -1, h = nums.length-1;
        int pivot = nums[h];

        for (int i = 0; i < h; i++) {
            if(nums[i]<=pivot){
                l++;
                swap(nums, l, i);
            }
        }

        swap(nums, l+1, h);
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
