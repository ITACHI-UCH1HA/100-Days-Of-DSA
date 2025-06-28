package day_024_date_2025_07_22.Math;

public class TrailingZeroes {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(trailingZeroes(num));
    }
// finding trailing zeroes in factorial of num
    private static int trailingZeroes(int num) {
        int count = 0;

        for (int i = 5; i <= num; i*=5) {
            count+= num/i;
        }

        return count;
    }
}
