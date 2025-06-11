package Day_017_Date_2025_06_11.hashing;

import java.util.*;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 7, 5 };

		System.out.println(subarraySum(arr, 12));

	}

	private static ArrayList<Integer> subarraySum(int[] arr, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int prefixSum = 0;
		
		for(int i=0; i< arr.length; i++) {
			prefixSum += arr[i];
			
			if(prefixSum==target) {
				list.add(1);
				
				list.add(i+1);
				
				return list;
			}
			int compliment = prefixSum-target;
			if(map.containsKey(compliment)) {
				list.add(map.get(compliment)+2);
				list.add(i+1);
				return list;
			}
			
			map.put(prefixSum, i);
		}
		
		list.add(-1);
		return list;
	}

//	public static ArrayList<Integer> subarraySum(int[] arr, int target) {
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		HashMap<Integer, Integer> map = new HashMap<>();
//		
//		for(int i=0; i<arr.length; i++) {
//			
//			int prefix = arr[i]+map.getOrDefault(i-1,0);
//			
//			if(prefix==target) {
//				list.add(1);
//				if (i==0)
//					list.add(i);
//				else
//					list.add(i+1);
//				return list;
//			}
//			
//			map.put(prefix,i);
//			
//		}
//		
//		System.out.println(map.values());
//		
	////		for(int i=0; i<arr.length; i++) {
////			if(map.get(i)<target) {
////				continue;
////			}
////			int compliment = target- map.get(i);
////			
////			if(map.containsKey(compliment)) {
////				list.add(map.get(compliment));
////				list.add(i+1);
////				return list;
////			}
////		}
//		int i=0;
//		for(int num:map.values()) {
//			i++;
//			
//			int compliment = target-num;
//			
//			if(map.containsKey(compliment)) {
//				list.add(map.get(compliment)+1);
//				list.add(i+1);
//				return list;
//			}
//		}
//		
//		list.add(-1);
//        return list;
//    }

	public static ArrayList<Integer> subarraySum1(int[] arr, int target) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			int sum = 0;

			for (int j = i; j < arr.length; j++) {
				sum += arr[j];

				if (sum == target) {
					list.add(i + 1);
					list.add(j + 1);

					return list;
				}
			}
		}

		return list;

	}
}
