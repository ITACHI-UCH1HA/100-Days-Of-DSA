package Day_007_Date_2024_08_13.TCS_IPA.Question2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class dkjflkds {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int ans=findNonDulpicate(nums);
        System.out.println(ans);
    }

    private static int findNonDulpicate2(int[] nums) {
        int len= nums.length;
        boolean flag= false;
        for (int i = 0; i < len-1; i++) {
            int num= nums[i];
            for (int j = i+1; j < len; j++) {
                if(num== nums[j]){
                    flag= true;
                }
            }
            if(!flag){
                return num;
            }
        }
        return 0;
    }

    private static int findNonDulpicate(int[] nums) {
        int ans=0;
        for(int num: nums){
            ans^= num;
        }
        return ans;
    }

}
// int 45
// String "hello world"
// double 45.00
