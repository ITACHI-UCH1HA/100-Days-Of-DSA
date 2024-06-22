package Day_003_Date_2024_06_22;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] nums={7,5,2,4,3,6,1};
        countingSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void countingSort(int[] nums) {
        int max= Arrays.stream(nums).max().getAsInt();
        int count[]= new int[max+1];
        int n= nums.length;

        for (int i = 0; i < n; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];
        }

        int[] outputArray= new int[n];
        
        for (int i = n - 1; i >= 0; i--) {
            int num = nums[i];
            outputArray[--count[num]] = num;
        }

        System.arraycopy(outputArray,0,nums,0, n);
    }
}
