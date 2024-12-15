package Day_011_Date_2024_12_15.contestGFG;

public class LongestSubArrayLength {
    public static void main(String[] args) {

//        int[] arr = { 1, 2, 2, 2, 2, 2, 3, 3 };

        int[] arr = { 1 , 2 , 3 , 3 };

        System.out.println(longestLength(arr, arr.length));
    }
    public static int longestLength(int arr[], int n)
    {

        if(n==1){
            return 1;
        }

        int length = 1;
        int count = 1;
        int candidate = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==candidate){
                count++;
            }else{
                candidate= arr[i];
                length = Math.max(length, count);
                count = 1;
            }
        }

        length = Math.max(length, count);

        return length;
    }
    public static int findCandidate(int arr[] , int n){
        int count  = 0;
        int candidate = -1;
        for(int num : arr){
            if(count==0){
                candidate=num;
            }
            count += (num==candidate)?1:-1;
        }
        return candidate;
    }
}
