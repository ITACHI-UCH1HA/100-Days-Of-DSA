package Day_008_Date_2024_12_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TakeGiftsFromTheRichestPile {
    public static void main(String[] args) {
        int[] nums = {25,64,9,4,100};
        int k = 4;

        System.out.println(pickGifts2(nums, k));
    }

    private static long pickGifts2(int[] gifts, int k) {
        long sum = 0;



        for(int num : gifts){
            sum+= num;
        }

        return sum;
    }

    public static long pickGifts(int[] gifts, int k) {
        int index = 0;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            long currMax = Integer.MIN_VALUE;
            for (int j = 0; j < gifts.length; j++) {
                if(gifts[j]>currMax){
                    currMax = gifts[j];
                    index = j;
                }
            }
            gifts[index] = (int)Math.floor(Math.sqrt(currMax));
        }

        for (int i = 0; i < gifts.length; i++) {
            sum+= gifts[i];
        }
        System.out.println(Arrays.toString(gifts));
        return sum;
    }
}
