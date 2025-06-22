package day_023_date_2025_07_02.greedy;

//https://www.geeksforgeeks.org/problems/-minimum-number-of-coins4426/1

import java.util.*;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        int N = 1000;

        System.out.println(minPartition(N));
    }
    public static List<Integer> minPartition(int N) {
        // it was given that these are the only available coins
        int[] coins = {1,2,5,10,20,50,100,200,500,2000};
        List<Integer> listOfCoins = new ArrayList<>();

        int i = coins.length-1;

        while(N>0){
            if(coins[i]>N){
                i--;
                continue;
            }
            listOfCoins.add(coins[i]);
            N -= coins[i];
        }

        return listOfCoins;
    }
}
