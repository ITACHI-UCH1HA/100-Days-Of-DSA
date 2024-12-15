package Day_010_Date_2024_12_14.arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));

    }

    private static int getSecondLargest2(int[] arr) {
        if(arr.length==1){
            return -1;
        }

        Arrays.sort(arr);
        int n = arr.length;

        if(arr[0]==arr[n-1]){
            return -1;
        }

        for(int i = n-2; i >= 0 ; i--){
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static int getSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
