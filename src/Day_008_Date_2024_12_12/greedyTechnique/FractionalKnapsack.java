package Day_008_Date_2024_12_12.greedyTechnique;

import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        List<Integer> val = List.of(60, 100, 120);
        List<Integer> wt = List.of(10, 20, 30);
        int capacity = 50;


    }
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        double maxValue=0;

        List<Integer> ratio = new ArrayList<>();

        for (int i=0; i< val.size(); i++){
            ratio.add(val.get(i)/ wt.get(i));
        }


        return maxValue;
    }
}
