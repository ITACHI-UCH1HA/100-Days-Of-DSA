package Day_002_Date_2024_06_21;

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {
                1, 23, 45, 67, 89, 12, 34, 56, 78, 90, 11, 22, 33, 44, 55, 66, 77, 88, 99, 100,
                101, 121, 141, 161, 181, 201, 221, 241, 261, 281, 301, 321, 341, 361, 381, 401,
                421, 441, 461, 481, 501, 521, 541, 561, 581, 601, 621, 641, 661, 681, 701, 721,
                741, 761, 781, 801, 821, 841, 861, 881, 901, 921, 941, 961, 981, 1001, 1021,
                1041, 1061, 1081, 1101, 1121, 1141, 1161, 1181, 1201, 1221, 1241, 1261, 1281,
                1301, 1321, 1341, 1361, 1381, 1401, 1421, 1441, 1461, 1481, 1501, 1521, 1541,
                1561, 1581, 1601, 1621, 1641, 1661, 1681, 1701, 1721, 1741, 1761
        };

        System.out.println(findElement(nums, 541));
    }

    private static int findElement(int[] nums, int target) {
        int[] range= findRange(nums, target);
        int l=range[0], h= range[1];
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
        return -1;
    }
    private static int[] findRange(int[] nums, int target){
        int[] ans= {0,1};
        while(ans[1]>target){
            ans[0]= ans[1];
            ans[1]*=2;
        }
        return ans;
    }
}
