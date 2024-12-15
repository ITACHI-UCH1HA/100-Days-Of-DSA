package Day_010_Date_2024_12_14.recursion;

public class PowerOfRecursion {
    public static void main(String[] args) {
        int n = 9;
        int p = 9;
        System.out.println(power(9,9));
    }
    public static int power(int n, int p){
        if(p==0){
            return 1;
        }
        if(p==1){
            return n;
        }

        int halfPower = power(n, p/2);

        if(p%2==1){
            return n*halfPower*halfPower;
        }
        return halfPower*halfPower;
    }
}
