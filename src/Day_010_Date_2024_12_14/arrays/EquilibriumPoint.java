package Day_010_Date_2024_12_14.arrays;

import java.util.Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 2 };
        System.out.println(equilibriumPoint_Efficient(arr));
    }

    private static int equilibriumPoint_Efficient(int[] arr) {
        int n = arr.length;
        int leftSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        for (int i = n-1; i >=0; i--) {
            sum -= arr[i];

            if(leftSum==sum){
                return i+1;
            }

            leftSum+= arr[i];
        }

        return -1;
    }

    private static int equilibriumPoint_Naive(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n-1; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum+= arr[j];
            }
            int rightSum = 0;
            for (int j = i+1; j < n; j++) {
                rightSum +=  arr[j];
            }

            if(leftSum==rightSum){
                return i+1;
            }
        }

        return -1;
    }

    public static int equilibriumPoint(int arr[]) {
        int n = arr.length;
        int[] preSum = new int[n];
        int[] postSum = new int[n];

        preSum[0] = 0;
        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i-1] + arr[i-1];
        }

        postSum[n-1] = 0;

        for (int i = n-2; i >= 0; i--) {
            postSum[i] = postSum[i+1] + arr[i+1];
            if(preSum[i]==postSum[i]){
                return i+1;
            }
        }
        return -1;
    }
}
