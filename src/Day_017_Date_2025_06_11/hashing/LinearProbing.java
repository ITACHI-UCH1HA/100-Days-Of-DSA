package Day_017_Date_2025_06_11.hashing;

import java.util.Arrays;

public class LinearProbing {

	public static void main(String[] args) {
//		int[] arr = {4,14,24,44};
		int[] arr = {11, 15, 1, 13, 14, 9, 9, 20};
		int sizeOfArray = arr.length;
		int hash_size = 7;
		
		System.out.println(Arrays.toString(linearProbing(hash_size, arr, sizeOfArray)));
	}

	private static int[] linearProbing(int hash_size, int[] arr, int sizeOfArray) {
		int[] hashTable = new int[hash_size];
		
        for(int i=0; i< hash_size; i++){
            hashTable[i]= -1;
        }
        
        
        for(int i=0; i< sizeOfArray; i++){
        	
            int count = 0;
            int hashKey = (arr[i]+count)%hash_size;
            int start = hashKey;
            
            boolean emptySpaceExists = true;
            
            while(hashTable[hashKey]!=-1){
            	if(hashTable[hashKey]==arr[i]) {
            		break;
            	}
                count++;
                hashKey = (arr[i]+count)%hash_size;
                if(hashKey==start){
                	emptySpaceExists = false;
                    break;
                }
            }
            if(emptySpaceExists) {
            	hashTable[hashKey] = arr[i];
            }
        }
        
        return hashTable;
	}

}
