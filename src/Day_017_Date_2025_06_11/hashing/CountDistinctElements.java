package Day_017_Date_2025_06_11.hashing;

import java.util.*;
import java.util.stream.Collectors;

public class CountDistinctElements {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 10, 20, 30, 2 };
		System.out.println(countDistinct(arr));

	}

	public static int countDistinct1(int[] arr) {

		int len = arr.length;
		int count = 0;
		for (int i = 0; i < len; i++) {

			boolean duplicate = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}

			if (!duplicate) {
				count++;
			}
		}

		return count;
	}

	public static int countDistinct(int[] arr) {
		HashSet<Integer> set = new HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
		return set.size();
	}
}
