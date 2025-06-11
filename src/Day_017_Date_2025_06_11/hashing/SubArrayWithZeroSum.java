package Day_017_Date_2025_06_11.hashing;

import java.util.*;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		int[] arr = { 4, 2, -3 , 6};
		System.out.println(findSum(arr));
	}

	private static boolean findSum(int[] arr) {
//		HashMap<Integer,Integer> map = new HashMap<>();
//		
//		for(int i=0; i<arr.length; i++) {
//			
//			int prefix = arr[i]+map.getOrDefault(i-1,0);
//			
//			if(prefix==0) {
//				return true;
//			}
//			
//			map.put(i, prefix);
//			
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			int complement = 0-map.get(i);
//			
//			if(map.containsValue(complement)) {
//				return true;
//			}
//		}
		
		HashSet<Integer> set = new HashSet<>();
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
			
			if(set.contains(sum) || sum==0) {
				return true;
			}
			
			set.add(sum);
		}
		
		return false;
	}
	

	public static boolean findSum1(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = len - 1; j >= i; j--) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
				}
				if (sum == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean findSum2(int arr[]) {
		int len = arr.length;

		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j < len; j++) {
				sum += arr[j];

				if (sum == 0) {
					return true;
				}
			}
		}

		return false;
	}
}
