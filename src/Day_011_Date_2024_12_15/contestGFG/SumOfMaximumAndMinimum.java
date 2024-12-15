package Day_011_Date_2024_12_15.contestGFG;

public class SumOfMaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr = {1,6,3,4,5};
        System.out.println(sumOfMaxandMin(arr, arr.length));
    }
    public static int sumOfMaxandMin(int arr[], int n)
    {
        int min = arr[0];
        int max = arr[0];

        for(int num: arr){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return min+max;
    }
}
