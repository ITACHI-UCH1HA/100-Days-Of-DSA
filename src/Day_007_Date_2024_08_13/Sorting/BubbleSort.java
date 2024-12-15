package Day_007_Date_2024_08_13.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums= {5,4,3,2,1};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubbleSort(int[] nums){
        int n= nums.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if(nums[j]>nums[j+1]){
                    swap(nums, j, j+1);
                }
            }
        }
    }
    public static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}
