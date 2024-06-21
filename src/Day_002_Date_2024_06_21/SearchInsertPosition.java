package Day_002_Date_2024_06_21;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        System.out.println(searchInsert(nums,7));
    }
    public static int searchInsert(int[] nums, int target) {
        int l=0, h=nums.length-1;

        while(l<=h){
            int m= l+(h-l)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return l;
    }
}
