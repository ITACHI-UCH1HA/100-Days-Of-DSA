package Day_018_Date_2025_06_12.searching;

import java.util.*;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 1, 3, 5, 1 };
		System.out.println(majorityElement(arr));
	}
	public static int majorityElement(int arr[]) {
		int majority = -1;
		int currMax = Integer.MIN_VALUE;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		
		for(int num:arr) {
			int val = map.getOrDefault(num, 0)+1;
			map.put(num, val);
			if(val>currMax) {
				currMax = val;
				majority = num;
			}
		}
		
		if(currMax>arr.length/2){
		    return majority;
		}else{
		    return -1;
		}
    }
}
