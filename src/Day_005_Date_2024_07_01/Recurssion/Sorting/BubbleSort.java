package Day_005_Date_2024_07_01.Recurssion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums= {5,4,3,2,1};
        bubbleSort(nums, nums.length, 0);
        System.out.println(Arrays.toString(nums));
    }
    private static void bubbleSort(int[] nums, int r, int c){
        // Base case for rows: if r is 0, the array is fully sorted
        if (r == 0) {
            return;
        }
        boolean swapped= false;
        // Base case for columns: if c is less than r - 1, continue sorting this row
        if (c < r - 1) {
            if (nums[c] > nums[c + 1]) {
                // Swap the elements if they are in the wrong order
                swap(nums, c, c + 1);
                swapped= true;
            }
            if(!swapped){
                return;
            }
            // Recursive call to process the next element in the current row
            bubbleSort(nums, r, c + 1);
        } else {
            // Recursive call to process the next row
            bubbleSort(nums, r - 1, 0);
        }
    }
    private static void bubbleSort1(int[] nums){
        int n= nums.length;
        for (int i = 0; i < n-1; i++) {
            boolean swapped= false;
            for (int j = 0; j < n-1; j++) {
                if(nums[j]>nums[j+1]){
                    swap(nums, j, j+1);
                    swapped= true;
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
