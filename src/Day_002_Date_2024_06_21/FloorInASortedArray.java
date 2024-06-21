package Day_002_Date_2024_06_21;

public class FloorInASortedArray {
    public static void main(String[] args) {
        long[] nums= {1,2,8,10,11,12,19};
        System.out.println(findFloor(nums, nums.length, 0));
    }

    private static int findFloor(long[] arr, int n, long x) {
        if(n==0){
            return -1;
        }
        int l=0, h= n-1;

        while(l<=h){
            int m= l+(h-l)/2;
            if(arr[m]==x){
                return m;
            }else if(arr[m]<x){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return h;
    }
}
