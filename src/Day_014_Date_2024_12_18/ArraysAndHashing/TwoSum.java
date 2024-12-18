package Day_014_Date_2024_12_18.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2,7,11,15 };
        int target = 96;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1,-1};
    }
}
