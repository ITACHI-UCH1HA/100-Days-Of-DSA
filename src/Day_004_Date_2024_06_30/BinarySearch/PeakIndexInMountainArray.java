package Day_004_Date_2024_06_30.BinarySearch;

class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] nums= {0,10,5,2};
        System.out.println(peakIndexInMountainArray(nums));
    }
    static int peakIndexInMountainArray(int[] nums){
        if(nums.length==3){
            return 1;
        }
        int l=0, h= nums.length-1;

        while(l<h){
            int m= l+(h-l)/2;
            if(nums[m]<nums[m+1]){
                l=m+1;
            }else{
                h=m;
            }
        }
        return l;
    }
}
