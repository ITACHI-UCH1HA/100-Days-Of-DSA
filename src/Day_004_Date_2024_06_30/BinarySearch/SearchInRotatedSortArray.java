package Day_004_Date_2024_06_30.BinarySearch;

public class SearchInRotatedSortArray {
    public static void main(String[] args) {
        int nums[] = {1};
        System.out.println(search(nums, 0));
    }
    public static int search(int[] nums, int target) {
        int index= findRotatedIndex(nums);

        if(nums[index]==target){
            return index;
        }
        int left= binarySearch(nums, target, 0, index-1);
        if(left!=-1){
            return left;
        }
        int right= binarySearch(nums, target, index+1, nums.length-1);
        if(right!=-1){
            return right;
        }
        return -1;
    }

    private static int findRotatedIndex(int[] nums) {
        int l=0, h= nums.length-1;
        while(l<=h){
            int m= l+(h-l)/2;
            if(m<h && nums[m]>nums[m+1]){
                return m+1;
            }
            if(m>l && nums[m]<nums[m-1]){
                return m;
            }
            if(nums[l]<=nums[m]){
                l= m+1;
            }else{
                h= m-1;
            }
        }
        return 0;
    }

    public static int binarySearch(int[] nums, int target, int l, int h){
        while(l<=h){
            int m= l+(h-l)/2;
            int num= nums[m];
            if(num==target){
                return m;
            } else if (num>target) {
                h= m-1;
            }else{
                l= m+1;
            }
        }
        return -1;
    }
}
