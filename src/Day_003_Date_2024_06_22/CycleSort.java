package Day_003_Date_2024_06_22;

import java.util.Arrays;

class CycleSort {
    public static void main(String[] args) {
        int[] nums={7,5,2,4,3,6,1};
        cyclicSort3(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void cyclicSort3(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // Since the numbers are in the range from 1 to n
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void cyclicSort2(int[] nums) {
        int n= nums.length;

        for (int i = 0; i < n; i++) {
            if(nums[i]-1!=i){
                swap(nums, nums[i]-1, i);
            }
        }
    }

    private static void cyclicSort(int[] nums) {
        int n= nums.length;

        for (int i = 0; i < n; i++) {
            if(nums[i]!=i){
                swap(nums, nums[i], i);
            }
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}
