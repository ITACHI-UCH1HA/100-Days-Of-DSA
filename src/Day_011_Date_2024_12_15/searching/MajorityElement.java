package Day_011_Date_2024_12_15.searching;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 3, 2 };
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr) {
        int candidate = findCandidate(arr);

        if(isMajority(arr, candidate)){
            return candidate;
        }

        return -1;
    }

    private static boolean isMajority(int[] arr, int candidate) {
        int count = 0;
        for (int num : arr){
            if(num==candidate){
                count++;
            }
        }

        return count> arr.length/2?true:false;
    }

    private static int findCandidate(int[] arr) {
        int count = 0;
        int candidate = -1;

        for (int num:arr){
            if(count==0){
                candidate= num;
            }

            count += (num==candidate)?1:-1;
        }

        return candidate;
    }

    public static int majorityElement_HashMap(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num: map.keySet()){
            if(map.get(num)>arr.length/2){
                return num;
            }
        }
        return -1;
    }
}
