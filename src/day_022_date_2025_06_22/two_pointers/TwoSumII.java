package day_022_date_2025_06_22.two_pointers;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSumNaive(numbers, target)));
    }

    // here we assuming that O(1) space complexity is always mainted
    // hashmap cant be used coz that would take O(n) space
    private static int[] twoSumNaive(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }

        return new int[]{-1,-1};
    }

    private static int[] twoSum(int[] numbers, int target) {

        int i=0, j=numbers.length-1;

        while (i<j){
            int sum = numbers[i]+numbers[j];

            if(sum==target){
                return new int[]{i+1, j+1};
            }
            // we are decreasing the j coz we have already checked
            // previous i and j combi it was greater
            // so curr i and j is also still greater
            // then obiously j++ wouldnt work coz tested
            // then i++ might work but the previous i and j but already greater
            // since its a sorted i++ and j would be even greater
            // so j-- is only option in this case
            else if(sum>target){
                j--;
            }
            // we are increasing the i coz we have already checked
            // previous i and j combi it was smaller
            // and curr i and j is also still smaller
            // then obiously i-- wouldnt work coz tested
            // then j-- might work but the previous i and j but already smaller
            // since its a sorted i and j-- would be even smaller
            // so i++ is only option in this case
            else{
                i++;
            }
        }

        // wont reach here coz the problem has guaranteed solution
        return new int[]{-1,-1};
    }
}
