package day_026_date_2025_09_15.leetcode;

import java.util.HashMap;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        int nums[] = {1,2,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }

    static {
        for (int i = 0; i < 100; i++) {
            maxFrequencyElements(new int[]{});
        }
    }

    private static int maxFrequencyElements(int[] nums) {
        // its given that the range of nums is 1<= nums[i] <=100
        int len = nums.length;
        if(len==0){
            return 0;
        }
        int[] arr = new int[101];

        int maxFreq = 0;

        for (int i = 0; i < len; i++) {
            arr[nums[i]]++;
            maxFreq = Math.max(maxFreq, arr[nums[i]]);
        }

        int sum = 0;

        for (int num : arr) {
            if(num==maxFreq){
                sum+=num;
            }
        }

        return sum;
    }
    public static int maxFrequencyElementss(int[] nums) {
        int count = 0;
        int maxFreq = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for (int num : map.keySet()) {
            int freq = map.get(num);
            if(freq==maxFreq){
                count++;
            }else if(freq>maxFreq){
                maxFreq = freq;
                count = 1;
            }
        }


        return count*maxFreq;
    }
}
