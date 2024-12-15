package Day_004_Date_2024_06_30.BinarySearch;

public class BinarySearchDESC {
    public static void main(String[] args) {
        int[] nums= {5,4,3,2,1};
        System.out.println(binarySearch(nums, 1));
    }
    static int binarySearch(int[] nums, int target){
        int l=0, h= nums.length-1;
        while(l<=h){
            int m= l+(h-l)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]<target){
                h= m-1;
            }else{
                l= m+1;
            }
        }
        return -1;
    }
}
