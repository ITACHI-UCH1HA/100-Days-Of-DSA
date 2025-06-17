package day_020_date_2025_06_16.sorting;

import java.util.Arrays;

public class MergingTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5};
        int[] arr2 = {2,3,6};

        System.out.println(Arrays.toString(mergeTwoSortedArrays(arr1,arr2)));
    }

    private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] arr = new int[len1+len2];

        int i=0, j=0, k=0;

        while(i<len1 && j<len2){
            if(arr1[i]<arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<len1){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j<len2){
            arr[k] = arr2[j];
            j++;
            k++;
        }

        return arr;
    }
}
