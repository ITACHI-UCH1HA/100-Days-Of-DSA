package Day_002_Date_2024_06_21;

import java.util.Arrays;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] nums= {0,10,5,2};
        System.out.println(peakIndexInMountainArray(nums));
    }

    private static int peakIndexInMountainArray(int[] nums) {
        int len= nums.length;

        if(len==3){
            return 1;
        }

        int l=0, h= len-1;

        while(l<h){
            int m= l+(h-l)/2;

            if(nums[m]<nums[m+1]){
                l=m+1;
            }else{
                h=m;
            }
        }

        return h;
    }
}
