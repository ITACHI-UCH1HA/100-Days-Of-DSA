package Day_010_Date_2024_12_14.arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 4 };

        int n = removeDuplicates2(arr);

        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i+1<n){
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
    }

    private static int removeDuplicates2(int[] arr) {
        int[] temp = new int[arr.length];

        int j = 0;

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            if(arr[i]!=arr[i+1]){
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n-1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }

    public static int removeDuplicates(int[] arr) {
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                arr[index] = arr[i];
                index++;
            }
        }

        return index;
    }
}
