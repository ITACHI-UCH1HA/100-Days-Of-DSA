package Day_010_Date_2024_12_14.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSumQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 4, 5, 3, 2, 5 };

        int[] pre = preCompute(arr);

        System.out.println(Arrays.toString(pre));

        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int h = sc.nextInt();

            System.out.println(findSum(l, h, pre));
        }
    }

    private static int findSum(int l, int h, int[] pre) {
        if(l==0){
            return pre[h];
        }
        return pre[h] - pre[l-1];
    }

    private static int[] preCompute(int[] arr) {
        int n = arr.length;
        int[] pre = new int[n];

        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i-1] + arr[i];
        }

        return pre;
    }
}
