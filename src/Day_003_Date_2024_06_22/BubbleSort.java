package Day_003_Date_2024_06_22;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1,0};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void bubbleSort(int[] nums) {
        int len= nums.length;
        for (int i = 0; i < len-1; i++) {
            boolean swapped= false;
            for (int j = 0; j < len-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    swap(nums, j, j+1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}
