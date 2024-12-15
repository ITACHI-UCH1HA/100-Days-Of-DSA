package Day_010_Date_2024_12_14.arrays;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(maxSubarraySum(arr));
    }
    public static int maxSubarraySum(int[] arr) {
        int res = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxSum = Math.max(arr[i], maxSum+arr[i]);

            res = Math.max(res, maxSum);
        }

        return res;
    }
}
