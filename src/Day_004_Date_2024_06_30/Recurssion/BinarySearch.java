package Day_004_Date_2024_06_30.Recurssion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6};
        System.out.println(binarySearch(nums, 4, 0, nums.length-1));
    }
    public static int binarySearch(int nums[], int target, int start, int end){
        if((end-start)<0){
            return -1;
        }
        int mid= start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            return binarySearch(nums, target, mid+1, end);
        } else{
            return binarySearch(nums, target, start, mid-1);
        }
    }
}
