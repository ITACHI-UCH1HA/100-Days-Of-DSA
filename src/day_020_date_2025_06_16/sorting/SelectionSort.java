package day_020_date_2025_06_16.sorting;

import java.util.Arrays;

//in selection sort the smallest number is first searched then
//its placed in its corresponding place

public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		selectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void selectionSort(int[] nums) {
		int len = nums.length;
		
		// Outer loop iterates to place each element at its correct sorted position
		for (int i = 0; i < nums.length-1; i++) {
			int minIndex = i ;
			
			// Inner loop finds the index of the smallest element in the unsorted part
			// Iteration 0: find the smallest element
			// Iteration 1: find the second smallest, and so on

			for (int j = i+1; j < nums.length; j++) {
				if(nums[minIndex]>nums[j]) {
					// the index is continuously updated in each operation if
					// smaller value is found than current one
					minIndex=j;
				}
			}
			
			// After finding the smallest element for this iteration,
			// swap it with the current element at index i (only if needed).
			// If i is already the smallest, no swap is performed.

			if(minIndex!=i) {
				swap(nums, minIndex, i);
			}
		}
	}
	
	// swap function
	private static void swap(int[] nums, int minIndex, int i) {
		int temp = nums[minIndex];
		nums[minIndex] = nums[i];
		nums[i] = temp;
	}

	// naive approach
	private static void selectionSortNaive(int[] nums) {
		int len = nums.length;
		
		// Create a temporary array to store sorted elements

		int[] temp = new int[len];
		
		for( int i=0; i<len; i++) {
			int minIndex = 0;
			for( int j=0; j<len ; j++) {
				if(nums[j]<nums[minIndex]) {
					minIndex = j;
				}
			}
			temp[i] = nums[minIndex];
			nums[minIndex] = Integer.MAX_VALUE;
		}
		
		// The sorted array is stored in the temp array,
		// so we need to copy it back into nums.
		// Do NOT write nums = temp; that would just reassign the reference
		// and wouldn't affect the original array in main.
		// Instead, copy each element back to nums manually.

		for(int i=0; i<len ; i++) {
			nums[i] = temp[i];
		}
	}

}
