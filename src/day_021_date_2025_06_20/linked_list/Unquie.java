package day_021_date_2025_06_20.linked_list;

import java.util.Arrays;
import java.util.HashSet;

public class Unquie {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,2}; // if the length is n then there are
        // n-1 unique numbers for sure and the numbers are from 1 to n-1

        System.out.println(findDuplicatessss(nums));
    }

//    sum of n numbers is n*(n+1)/2
    // n-1 so sum of n-1 numbers is (n-1)(n)/2

    private static int findDuplicate(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    private static int findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // {1 2 3 4 5 6} 2
        for( int num: nums){
            if(set.contains(num)){
                return num;
            }

            set.add(num);
        }

        return -1;
    }
    private static int findDuplicatess(int[] nums) {

        int len = nums.length;

        int sum = 0 ;

        for( int num:nums){
            sum += num;
        }

        int duplicate  = sum - (len-1)*len/2;

        return duplicate;

    }
    private static int findDuplicatessss(int[] nums) {

        int len = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < len-1; i++) {
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }

        return -1;
    }
}
