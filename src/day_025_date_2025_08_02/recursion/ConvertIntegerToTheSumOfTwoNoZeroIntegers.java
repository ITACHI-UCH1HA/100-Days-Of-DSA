package day_025_date_2025_08_02.recursion;

import java.util.Arrays;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static void main(String[] args) {
        int n = 21222;
        System.out.println(Arrays.toString(getNoZeroIntegers(n)));
    }
    public static int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n-a;
            if(!String.valueOf(a).contains("0") && !String.valueOf(b).contains("0")){
                return new int[]{a,b};
            }
        }
        return new int[0];
    }
}
