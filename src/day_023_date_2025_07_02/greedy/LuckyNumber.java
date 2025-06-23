package day_023_date_2025_07_02.greedy;

//https://leetcode.com/problems/find-lucky-integer-in-an-array/description/?envType=daily-question&envId=2025-07-05

import java.util.*;

public class LuckyNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        System.out.println(luckyNumberEfficient(arr));
    }

    private static int luckyNumberEfficient(int[] arr) {
        int max = -1;
        int[] nums = new int[501];

        for ( int num : arr) {
            nums[num]++;
        }

        for (int i = 500; i >= 1; i--) {
            if(i==nums[i]){
                max = Math.max(max, i);
            }
        }

        return max;
    }

    private static int luckyNumberHash(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int max = -1;

        for(int num:arr){
            if(num==map.get(num)){
                max = Math.max(max, num);
            }
        }

        return max;
    }

    private static int luckyNumberSort(int[] arr) {
        Arrays.sort(arr);
        int max = -1;

        for (int i = 0; i < arr.length; ) {
            int num = arr[i];
            int count = 0;

            while(i< arr.length && arr[i]==num){
                count++;
                i++;
            }

            if(count==num){
                max = Math.max(max, num);
            }
        }

        return max;
    }

    public static int luckyNumberNaive(int[] arr){
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(num==arr[j]){
                    count++;
                }
            }

            if(count==num){
                max = Math.max(max, num);
            }
        }

        return max;
    }
}
