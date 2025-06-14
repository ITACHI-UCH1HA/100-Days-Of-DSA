package day_019_date_2024_06_14.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		bubbleSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void bubbleSort(int[] nums) {
		// logic here is that we will go through n^2 passes at worst
		// where in 
		for (int i = 0; i < nums.length-1; i++) {
			boolean swapped = false;
			for (int j = 0; j < nums.length-i-1; j++) {
				if(nums[j]>nums[j+1]) {
					swap(nums, j, j+1);
					swapped= true;
				}
			}
			
			// if there is no swap happened then that means all the
			// elements are in correct order
			if(!swapped) {
				break;
			}
		}
	}

	//swap the elements of the nums, nums[j] with nums[i] vice versa
 	private static void swap(int[] nums, int j, int i) {
		int temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
	}

}
