package Day_011_Date_2024_12_15.searching;

public class SquareRoot {
    public static void main(String[] args) {

        int n = 16;

        int sqrt = floorSqrt(n);

        System.out.println(sqrt);

    }
    public static int floorSqrt(int n) {
        int i = 1, j = n/2;
        int mid ;
        while(i<=j){
            mid = i + (j-i)/2;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid>n){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return j;
    }
}
