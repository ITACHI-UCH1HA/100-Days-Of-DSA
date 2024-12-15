package Day_008_Date_2024_12_12.greedyTechnique;

public class Knapsack {
    public static void main(String[] args) {
        int[] val = {1,2,3};
        int[] wt = {4,5,1};
        int capacity = 4;

        System.out.println(knapSack(val, wt, capacity));
    }
    public static int knapSack(int val[], int wt[] , int capacity) {
        int maxVal = 0;

        int n = val.length;
        double[] ratio = new double[n];

        int minWeight = wt[0];
        for (int i = 0; i < n; i++) {
            ratio[i] = val[i]/wt[i];

            minWeight= Math.min(minWeight, wt[i]);
        }

        if(minWeight>capacity){
            return 0;
        }

        while(capacity>0 && capacity>=minWeight){
            int index = 0;
            for (int i = 0; i < n; i++) {
                if(ratio[index]<ratio[i]){
                    index = i;
                }
            }

            if(wt[index]<=capacity){
                capacity-= wt[index];
            }
        }

        return maxVal;
    }
}
