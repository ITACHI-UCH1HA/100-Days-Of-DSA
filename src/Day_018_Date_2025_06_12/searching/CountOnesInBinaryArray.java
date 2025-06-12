package Day_018_Date_2025_06_12.searching;

public class CountOnesInBinaryArray {

	public static void main(String[] args) {
		int[] arr = { 1,1,1,1,1,0,0,0 };
		System.out.println(countOnes1(arr,arr.length));
	}
	public static int countOnes(int arr[], int N) {

        int l=0, h=N-1;
        
        while (l<=h) {
        	int m = l+(h-l)/2;
        	int num = arr[m];
        	if(num==1) {
        		l=m+1;
        	}else {
        		h=m-1;
        	}
        }
        	
        return l;
        
    }
	public static int countOnes1(int arr[], int N) {
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==1) {
				count++;
			}else {
				break;
			}
		}
		
		return count;
    }
}
