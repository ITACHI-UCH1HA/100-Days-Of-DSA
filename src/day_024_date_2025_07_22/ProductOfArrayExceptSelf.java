package day_024_date_2025_07_22;

//https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        //           {24,12,8,6}
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if(len==0){
            return nums;
        }
        int[] leftProduct = new int[len];
        int[] rightProduct = new int[len];

        leftProduct[0] = 1;

        for (int i = 1; i < len; i++) {
            leftProduct[i]= leftProduct[i-1]*nums[i-1];
        }

        rightProduct[len-1] = 1;

        for (int i = len-2; i >=0; i--) {
            rightProduct[i]= rightProduct[i+1]*nums[i+1];
        }

        for (int i = 0; i < len; i++) {
            nums[i] = leftProduct[i]*rightProduct[i];
        }

        return nums;
    }
}
