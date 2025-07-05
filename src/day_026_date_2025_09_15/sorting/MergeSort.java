package day_026_date_2025_09_15.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void mergeSort(int[] nums){
        helper(nums, 0, nums.length-1);
    }
    public static void helper(int[] nums, int l, int h){
        if(h>l){
            int mid = l+(h-l)/2;

            helper(nums, l, mid);
            helper(nums, mid+1, h);
            merge(nums, l, mid, h);
        }
    }
    public static void merge(int[] nums, int l, int m, int h){
        int i= l, j= m+1, k=0;
        int[] temp = new int[h-l+1];

        while (i<=m && j<=h){
            if(nums[i]<nums[j]){
                temp[k] = nums[i];
                i++;
            }else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i<=m){
            temp[k] = nums[i];
            i++;
            k++;
        }

        while (j<=h){
            temp[k] = nums[j];
            j++;
            k++;
        }

        for (int n = 0; n < temp.length; n++) {
            nums[n+l] = temp[n];
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
