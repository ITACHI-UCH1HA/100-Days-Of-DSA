package day_020_date_2025_06_16.sorting;

import java.util.Arrays;

// In insertion sort we need to insert each element 
// in their correct place, for that we need to assume
// a sorted section where we need to insert the elements
// then unsorted section where we need to get the elements from

// better explained below

public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		insertionSort(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void insertionSort(int[] nums) {
		int len = nums.length;
		// logic: At first its assumed that in {5,4,3,2,1}
		// element before i=0 is sorted and after i=0 unsorted
		// so we need to insert the elements from unsorted array
		// to sorted array in their right place
		for (int i = 1; i < len; i++) {
			// here j is taken as the index of last element in the sorted array
			// since -1 would give the out of bound error..
			// the for loop is started at 1
			int j = i-1;

			// here num is element which need to be inserted in sorted section
			int num = nums[i];

			// this while loop is runned to find the index where we need to insert
			while(j>=0 && nums[j]>num) {
				// this updation of elements are done so that space for the num
				// to be inserted is created
				nums[j+1] = nums[j];
				j--;
			}

			// j is behind the correct index because
			// that is the point where while loop ends so j+1 is
			// where we need to insert the num
			nums[j+1] = num;
		}

	}

}
