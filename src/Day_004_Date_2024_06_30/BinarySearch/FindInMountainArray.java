package Day_004_Date_2024_06_30.BinarySearch;

class FindInMountainArray {
    public static void main(String[] args) {
        int[] nums= {0,1,2,4,2,1};
        System.out.println(findInMountainArray(2, nums));
    }

    private static int findInMountainArray(int target, int[] nums) {
        int peakIndex= peakIndexInMountainArray(nums);
        int peakNum= nums[peakIndex];

        if(target==peakNum){
            return peakIndex;
        }

        int ASC= binarySearchASC(nums, target, 0, peakIndex-1);
        if(ASC!=-1){
            return ASC;
        }

        int DESC= binarySearchDESC(nums, target, peakIndex+1, nums.length-1);
        if(DESC!=-1){
            return DESC;
        }
        return -1;
    }
    static int binarySearchASC(int nums[], int target, int l, int h){
        while(l<=h){
            int m= l+(h-l)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]<target){
                l= m+1;
            }else{
                h= m-1;
            }
        }
        return -1;
    }
    static int binarySearchDESC(int nums[], int target, int l, int h){
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
