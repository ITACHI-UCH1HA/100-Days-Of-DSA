package Day_017_Date_2025_06_11.hashing;

import java.util.Arrays;

public class QuadraticProbing {

	public static void main(String[] args) {
//		int[] arr = {4,14,24,44};
		int[] arr = { 21,10,32,43 };
		int sizeOfArray = arr.length;
		int hash_size = 11;
		int[] hash = new int[hash_size];
		Arrays.fill(hash, -1);
		quadraticProbing(hash, hash_size, arr, sizeOfArray);
		System.out.println(Arrays.toString(hash));
	}

	public static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {
		for (int i = 0; i < N; i++) {
			int key = arr[i];
			int originalHash = key%hash_size;
			
			int count = 0;
			boolean inserted = false;
			
			while(count<hash_size) {
				int hashKey = (originalHash+(count*count))%hash_size;
				
				if(hash[hashKey]==-1 || hash[hashKey]==key) {
					hash[hashKey] = key;
					inserted = true;
					break;
				}
				
				count++;
			}
		}
	}
}
