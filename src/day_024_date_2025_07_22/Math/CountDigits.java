package day_024_date_2025_07_22.Math;

import java.math.BigInteger;

public class CountDigits {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(countDigits4(num));
    }

    private static int countDigits4(int num) {
        if(num<=0){
            return 0;
        }
        return 1+ countDigits4(num/10);
    }

    private static int countDigits3(int num) {
        return Integer.toString(num).length();
    }

    private static int countDigits2(int num) {
        int count = 0;

        while(num>0){
            num/=10;
            count++;
        }

        return count;
    }

    private static int countDigits1(int num) {
        return (int)Math.log10(num)+1;
    }
}
