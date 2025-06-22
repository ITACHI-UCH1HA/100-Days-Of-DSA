package day_021_date_2025_06_20.linked_list;

//https://leetcode.com/problems/nth-digit/?envType=problem-list-v2&envId=binary-search

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NthDigit {
    public static void main(String[] args) {
        int num = 24;
        System.out.println(findNthDigit(num));
    }

    public static int findNthDigit(int n) {
        if(n<=9){
            return n;
        }

        int groupId = 9;
        int digits = 1;
        int placeValue=1;
        int group = 9;

        while(n>group){
            digits++;
            placeValue*=10;
            group=digits*(groupId*placeValue)+group;
        }

        return 1;
    }

    private static int findNthDigit_naive(int num) {

//        int placeValue = 1;
//        int faceValue = 0;
//
//        while(num>0){
//            faceValue++;
//            num--;
//            if(faceValue>9){
//                placeValue= placeValue*10;
//                faceValue = 0;
//            }
//
//            int count = placeValue;
//
//            while(count>0){
//                num--;
//                count--;
//            }
//        }
//
//        return faceValue;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=num; i++){

            int currNum = i;
            list.add(currNum%10);
            currNum = currNum/10;


            int index = list.size()-1;
            while(currNum>0){
                list.add(index,currNum%10);
                currNum/=10;
            }
        }

        return list.get(num-1);
    }
}
