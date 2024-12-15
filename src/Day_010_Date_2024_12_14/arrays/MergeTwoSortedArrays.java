package Day_010_Date_2024_12_14.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 4, 5 };
        int[] arr2 = { 2, 4, 6, 8 };

        int[] merged = merge_Naive(arr1, arr2);

        System.out.println(Arrays.toString(merged));
    }

    private static int[] merge_Efficient(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int[] merged = new int[m+n];

        int i = 0, j = 0 , k=0;

        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                merged[k] = arr1[i];
                i++;
            }else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<m ){
            merged[k] = arr1[i];
            i++;
            k++;
        }

        while(j<n ){
            merged[k] = arr2[j];
            j++;
            k++;
        }

        return merged;
    }

    private static int[] merge_Naive(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int[] merged = new int[m+n];

        for (int i = 0; i < m; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < n; i++) {
            merged[i+m] = arr2[i];
        }

        Arrays.sort(merged);

        return merged;
    }

}
