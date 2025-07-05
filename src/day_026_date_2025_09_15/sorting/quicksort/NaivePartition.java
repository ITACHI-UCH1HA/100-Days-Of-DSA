package day_026_date_2025_09_15.sorting.quicksort;

import java.util.Arrays;

public class NaivePartition {
    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        naivePartition(nums, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    private static void naivePartition(int[] nums, int p) {
        int n = nums.length;
        int idx = 0;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            if(i!=p && nums[i]<nums[p]){
                temp[idx++] = nums[i];
            }
        }

        temp[idx++] = nums[p];

        for (int i = 0; i < n; i++) {
            if(i!=p && nums[i]>=nums[p]){
                temp[idx++] = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
