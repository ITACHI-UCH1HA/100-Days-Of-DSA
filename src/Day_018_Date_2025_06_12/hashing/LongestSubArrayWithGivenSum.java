package Day_018_Date_2025_06_12.hashing;

import java.util.*;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		
		int[] arr = { -5, 8, -14, 2, 4, 12 };
		System.out.println(longestSubarray(arr,-5));
		
	}
	
	public static int longestSubarray1(int[] arr, int k) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
        	int sum = 0;
        	for(int j=i; j<arr.length; j++) {
        		sum+= arr[j];
        		if(sum==k) {
        			count= Math.max(count, j+1);
        		}
        	}
        }
        
        return count;
    }
	
	public static int longestSubarray(int[] arr, int k) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+= arr[i];
			if(sum==k) {
				count= Math.max(count, i+1);
			}
			int complement = sum - k;
			if(map.containsKey(complement)) {
				count = Math.max(count, i-map.get(complement));


			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		
		return count;
	}
}
