package Day_010_Date_2024_12_14.arrays;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arraySortedOrNot(arr));
    }
    public static boolean arraySortedOrNot(int[] arr) {
        return helper(arr, arr.length);
    }
    public static boolean helper(int[] arr, int n){
        if(n==0 || n==1){
            return true;
        }

        if(arr[n-1]<arr[n-2]){
            return false;
        }

        return helper(arr, n-1);
    }
}
