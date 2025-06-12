package Day_018_Date_2025_06_12.searching;

public class SortedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean searchInSorted(int arr[], int k) {
        int l=0, h= arr.length-1;
        
        while(l<=h) {
        	int m = l+(h-l)/2;
        	if(arr[m]==k) {
        		return true;
        	}else if(arr[m]<k) {
        		l=m+1;
        	}else {
        		h=m-1;
        	}
        }
        
        return false;
    }
}
