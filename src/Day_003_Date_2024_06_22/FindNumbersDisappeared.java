package Day_003_Date_2024_06_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindNumbersDisappeared {
    public static void main(String[] args) {
        int[] nums={};
        System.out.println(Arrays.toString(missingNumbers(nums)));
    }

    private static int[] missingNumbers(int[] nums) {
        List<Integer> list= new ArrayList<>();
        cyclicSort(nums);
        int n= nums.length;
        for (int i = 0; i < n; i++) {

        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private static void cyclicSort(int[] nums) {
        int n= nums.length;

        for (int i = 0; i < n; i++) {
            if(nums[i]-1!=i){
                swap(nums, nums[i]-1, i);
            }
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}
