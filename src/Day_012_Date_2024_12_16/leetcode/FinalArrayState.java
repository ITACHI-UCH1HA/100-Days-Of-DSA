package Day_012_Date_2024_12_16.leetcode;

import java.util.*;

public class FinalArrayState {
    public static void main(String[] args) {

        int[] nums = { 2,1,3,5,6 };
        int[] ans = getFinalState_Optimized(nums, 5, 2);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] getFinalState_Optimized(int[] nums, int k, int multiplier) {
        // Min-Heap to store pairs of (value, index)
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1])
        );

        // Initialize the heap with array values and their indices
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(new int[] {nums[i], i});
        }

        // Perform k operations
        for (int i = 0; i < k; i++) {
            // Extract the minimum value and its index
            int[] min = minHeap.poll();
            int value = min[0];
            int index = min[1];

            // Update the value in the array
            nums[index] = value * multiplier;

            // Add the updated value back into the heap
            minHeap.offer(new int[] {nums[index], index});
        }

        return nums;
    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {

        for (int i = 0; i < k; i++) {
            int index = 0;
            int small = nums[0];

            for (int j = 0; j < nums.length; j++) {
                if(nums[j]<small){
                    small = nums[j];
                    index= j;
                }
            }

            nums[index] *= multiplier;
        }

        return nums;
    }
}
