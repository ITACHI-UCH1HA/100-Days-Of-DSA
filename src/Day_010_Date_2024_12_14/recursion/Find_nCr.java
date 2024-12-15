package Day_010_Date_2024_12_14.recursion;

public class Find_nCr {
    public static void main(String[] args) {
        int n= 5;
        int r= 2;

        System.out.println(nCr_efficient(5,2));

    }

    private static int nCr_efficient(int n, int r) {
        if(n<r){
            return 0;
        }
        if(r==0 || n==r){
            return 1;
        }

        r = Math.min(r, n-r);

        int result = 1;

        for (int i = 0; i < r; i++) {
            result *= (n-i)/(i+1);
        }
        return result;
    }

    public static int nCr(int n,int r)
    {
        int numerator = factorial(n, 1);
        int denominator = factorial((n-r), 1) * factorial(r, 1);

        return numerator/denominator;
    }
    public static int factorial(int n, int fact){
        if(n==1){
            return fact;
        }

        return factorial(n-1, fact*n);
    }
}
