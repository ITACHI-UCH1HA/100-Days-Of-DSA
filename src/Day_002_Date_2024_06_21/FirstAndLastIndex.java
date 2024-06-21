package Day_002_Date_2024_06_21;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums={ 5, 7, 7, 8, 8, 10 };
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans={-1, -1};
        int len= nums.length;
        int l=0, h= len-1;

        while(l<=h){
            int m= l+(h-l)/2;
            if(nums[m]==target){
                ans[0]=m;
                h=m-1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        l=0;
        h=len-1;
        while(l<=h){
            int m= l+(h-l)/2;
            if(nums[m]==target){
                ans[1]=m;
                l=m+1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return ans;
    }
}
