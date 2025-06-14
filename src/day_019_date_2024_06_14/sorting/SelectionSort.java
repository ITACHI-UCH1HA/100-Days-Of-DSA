package day_019_date_2024_06_14.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,4,3,2,1};
		selectionSortNaive(nums);
		System.out.println(Arrays.toString(nums));
	}
	private static void selectionSortNaive(int[] nums) {
		int[] arr = new int[nums.length];
		
		for (int i = 0; i < arr.length; i++) {
			int smallest = Integer.MAX_VALUE;
			for (int j = i; j < arr.length; j++) {
				if(nums[j]<smallest) {
					smallest = nums[j];
				}
			}
			arr[i] = smallest;
		}
		
		nums=Arrays.copyOf(arr, arr.length);
	}
	
	private static void swap(int[] nums, int j, int i) {
		int temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
	}
}
