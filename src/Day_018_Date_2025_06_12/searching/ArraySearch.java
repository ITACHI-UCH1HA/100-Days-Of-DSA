package Day_018_Date_2025_06_12.searching;

public class ArraySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int x = 3;
		System.out.println();
	}
	public static int search(int arr[], int x) {
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]==x) {
        		return i;
        	}
        }
        return -1;
    }
}
