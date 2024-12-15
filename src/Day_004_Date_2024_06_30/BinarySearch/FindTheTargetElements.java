package Day_004_Date_2024_06_30.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheTargetElements {
    public static void main(String[] args) {
        int[] nums= {1,1,2,2,2,2,3,4,5};
        System.out.println(findTheTargetElements(nums, 2, 0, nums.length-1));
    }

    public static int[] findTheTargetElements(int[] nums, int target){
        int[] ans= {-1, -1};
        int start=0, end= nums.length-1;

        //check the left side
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                ans[0]= mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }

        start=0;
        end= nums.length-1;

        //check the right side
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                ans[1]= mid;
                start=mid+1;
            }else if(nums[mid]<target){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        return ans;
    }
    public static ArrayList<Integer> findTheTargetElements(int[] nums, int target, int start, int end){
        if(start<=end){

        }
        return new ArrayList<>();
    }
}
