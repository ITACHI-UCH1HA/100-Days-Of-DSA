package Day_002_Date_2024_06_21;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
//        int[][] sorted2DArray = {
//                {1,  2,  3,  4,  5},
//                {6,  7,  8,  9,  10},
//                {11, 12, 13, 14, 15},
//                {16, 17, 18, 19, 20},
//                {21, 22, 23, 24, 25}
//        };
        int[][] sorted2DArray={{1}};
        System.out.println(Arrays.toString(search(sorted2DArray, 0)));
    }
    public static int[] search(int[][] nums, int target){
        int clen=nums[0].length, rlen=nums.length;
        int rStart=0, rEnd= rlen-1;

        while(rStart<=rEnd){
            int m= rStart+(rEnd-rStart)/2;
            int mid=nums[m][0];
            if(mid==target){
                return new int[]{m,0};
            }else if(mid<target) {
                rStart=m+1;
            }else{
                rEnd= m-1;
            }
        }

        int cStart=0,cEnd=clen-1;

        while(cStart<=cEnd){
            int m= cStart+(cEnd-cStart)/2;
            int mid=nums[rEnd][m];

            if(mid==target){
                return new int[]{rEnd,m};
            } else if (mid<target) {
                cStart=m+1;
            }else{
                cEnd=m-1;
            }
        }
        return new int[]{-1,-1};
    }
}
