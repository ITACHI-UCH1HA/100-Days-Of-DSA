package Day_015_Date_2025_06_08.hashing;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];
        HashMap<Integer, Integer> map= new HashMap<>(); //key=nums[i], value=i

        for (int i = 0; i < nums.length; i++) {
            int compliment= target-nums[i];
            if(map.containsKey(compliment)) {
            	ans[0]= map.get(compliment);
            	ans[1]= i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
