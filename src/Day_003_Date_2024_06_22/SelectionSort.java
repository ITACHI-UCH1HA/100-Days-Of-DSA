package Day_003_Date_2024_06_22;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1,0};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSort(int[] nums) {
        int len= nums.length;
        for (int i = 0; i < len-1; i++) {
            int index= i;
            for (int j = i+1; j < len; j++) {
                if(nums[index]>nums[j]){
                    index=j;
                }
            }
            swap(nums, index,i);
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}
