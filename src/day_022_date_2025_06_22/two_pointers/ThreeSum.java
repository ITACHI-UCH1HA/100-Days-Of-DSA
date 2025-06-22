package day_022_date_2025_06_22.two_pointers;

//https://leetcode.com/problems/3sum/description/

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSumNaive(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]+nums[j]+nums[k]==0){
                        int[] triplets = {nums[i],nums[j],nums[k]};
                        Arrays.sort(triplets);

                        if(!list.contains(List.of(triplets[0],triplets[1],triplets[2]))){
                            list.add(List.of(triplets[0],triplets[1],triplets[2]));
                        }
                    }
                }
            }
        }

        return list;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            int target = 0-nums[i];
            int[] twoSum = findTwoSum(nums,target,i+1);
            if(twoSum!=null){
                int[] triplets = {nums[i],nums[twoSum[0]],nums[twoSum[1]]};
                Arrays.sort(triplets);

                if(!list.contains(List.of(triplets[0],triplets[1],triplets[2]))){
                    list.add(List.of(triplets[0],triplets[1],triplets[2]));
                }
            }
        }

        return list;
    }

    private static int[] findTwoSum(int[] nums, int target, int start) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=start; i< nums.length; i++){
            int compliment = target- nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
