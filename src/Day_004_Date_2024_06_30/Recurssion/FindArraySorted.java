package Day_004_Date_2024_06_30.Recurssion;

class FindArraySorted {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        System.out.println(findArraysSorted(nums));
    }

    private static boolean findArraysSorted(int[] nums) {
        return findArraysSorted(nums, 0);
    }
    private static boolean findArraysSorted(int[] nums, int index) {
        if(index>= nums.length-1){
            return true;
        }
        if(nums[index]>nums[index+1]){
            return false;
        }
        return (nums[index]<nums[index+1]) && findArraysSorted(nums, ++index);
    }
}
