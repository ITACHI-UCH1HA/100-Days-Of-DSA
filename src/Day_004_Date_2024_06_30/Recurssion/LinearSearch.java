package Day_004_Date_2024_06_30.Recurssion;

class LinearSearch {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7,8,9};
        System.out.println(linearSearch(nums,5));
    }

    private static boolean linearSearch(int[] nums, int target) {
        return linearSearch(nums, target, 0);
    }
    private static boolean linearSearch(int nums[], int target, int index){
        if(index>= nums.length){
            return false;
        }
        if(nums[index]==target){
            return true;
        }
        return linearSearch(nums, target, ++index);
    }
}
