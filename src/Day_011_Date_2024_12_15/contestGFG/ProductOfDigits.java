package Day_011_Date_2024_12_15.contestGFG;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n1 = 35;
        int n2 = 6798;
        System.out.println(sumOfProductOfDigits(n1,n2));
    }
    public static int sumOfProductOfDigits(int n1, int n2)
    {
        return helper(n1,n2, 0);
    }
    public static int helper(int n1, int n2, int sum){
        if(n1<=0 || n2<=0){
            return sum;
        }
        int remProduct = (n1%10)*(n2%10);
        return helper(n1/10, n2/10, sum+remProduct);
    }
}
