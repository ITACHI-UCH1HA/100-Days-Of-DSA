package Day_003_Date_2024_06_22;

import java.util.Arrays;

class MergeSort {
    public static void main(String[] args) {
        int[] nums={7,5,2,4,3,6,1};
        mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    private static void mergeSort(int[] nums, int s, int e){
        if(e-s<1){
            return;
        }
        int mid= s+(e-s)/2;
        mergeSort(nums,s,mid);
        mergeSort(nums, mid+1, e);
        merge(nums,s,e,mid);
    }
    private static void merge(int[] nums, int s, int e, int m){
        int[] arr= new int[e-s+1];
        int i=s, j=m+1, k=0;
        while(i<=m && j<=e){
            if(nums[i]<nums[j]){
                arr[k]= nums[i];
                i++;
            }else{
                arr[k]= nums[j];
                j++;
            }
            k++;
        }
        while(i<=m){
            arr[k]= nums[i];
            i++;
            k++;
        }
        while(j<=e){
            arr[k]= nums[j];
            j++;
            k++;
        }

        for (int l = 0; l < arr.length; l++) {
            nums[l+s]= arr[l];
        }
    }
}
