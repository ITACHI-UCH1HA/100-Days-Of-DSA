package Day_010_Date_2024_12_14.recursion;

public class GCD {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        System.out.println(GCD(a,b));
    }
    public static int GCD(int a, int b)
    {
        int i = 1;
        int ans = 1;
        while ( i<=a && i<=b){
            if(a%i==0 && b%i==0){
                ans = i;
            }
            i++;
        }

        return ans;
    }
}
