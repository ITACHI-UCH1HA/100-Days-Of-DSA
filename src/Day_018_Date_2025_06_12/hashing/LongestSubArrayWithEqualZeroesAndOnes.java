package Day_018_Date_2025_06_12.hashing;

public class LongestSubArrayWithEqualZeroesAndOnes {

	public static void main(String[] args) {
//		int[] arr = { 1, 0, 1, 1, 1, 0, 0 };
		int[] arr = { 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0 };
		System.out.println(maxLen(arr));
	}
	public static int maxLen(int[] arr) {
        int count = 0;
        
        int ones = 0;
        
        int zeroes = 0;
        
        for(int i=0; i<arr.length ; i++) {
        	if(arr[i]==0) {
        		zeroes++;
        	}else {
        		ones++;
        	}
        }
        
        return Math.min(ones, zeroes)*2;
    }
}
