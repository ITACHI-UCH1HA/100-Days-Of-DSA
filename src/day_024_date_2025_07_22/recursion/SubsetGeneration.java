package day_024_date_2025_07_22.recursion;

//https://www.geeksforgeeks.org/problems/subsets-1613027340/1

import java.util.ArrayList;

public class SubsetGeneration {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
    public static ArrayList<ArrayList<Integer>> subsets(int nums[]){
        ArrayList<ArrayList<Integer>> generatedSubsets = new ArrayList<>();
        generatedSubsets.add(new ArrayList<>());
       // System.out.println(generatedSubsets);
        return helper(nums, generatedSubsets,0);
    }
    public static ArrayList<ArrayList<Integer>> helper(int[] nums,
                         ArrayList<ArrayList<Integer>> generatedSubsets,
                         int index){
        if(index>= nums.length){
            return generatedSubsets;
        }

        ArrayList<ArrayList<Integer>> list = generatedSubsets;

        for (ArrayList<Integer> set : new ArrayList<>(generatedSubsets)) {
            ArrayList<Integer> newSet = new ArrayList<>(set); // clone
            newSet.add(nums[index]);                           // add current number
            generatedSubsets.add(newSet);                      // add new subset
        }


        return helper(nums, generatedSubsets, index+1);

    }
}
