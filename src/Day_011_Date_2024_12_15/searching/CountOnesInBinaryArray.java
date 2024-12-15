package Day_011_Date_2024_12_15.searching;

public class CountOnesInBinaryArray {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1, 0, 0, 0 };
        int count = countOnes(arr, arr.length);

        System.out.println(count);
    }
    public static int countOnes(int arr[], int N){
        int i = 0, j = N-1;
        int mid ;
        while (i<=j){
            mid = i + (j-i)/2;
            if(arr[mid]==1){
                i = mid+1;
            }else if(arr[mid]==0){
                j = mid-1;
            }
        }
        return i;
    }
}
