package Day_003_Date_2024_06_22;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1,0};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void insertionSort(int[] nums) {
        int n= nums.length;
        for (int i = 1; i < n; i++) {
            int key= nums[i];
            int j=i-1;
            while(j>=0 && key<nums[j]){
                nums[j+1]= nums[j--];
            }
            nums[j+1]= key;
        }
    }
}
