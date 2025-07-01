package day_024_date_2025_07_22.recursion;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        int n = 5;
        int a = 4;
        int b = 2;
        int c = 3;

        System.out.println(ropeCuttingProblem(n,a,b,c));
    }

    private static int ropeCuttingProblem(int n, int a, int b, int c) {
        if(n==0) return 0; //valid cut;
        if(n<0) return -1; //invalid cut;

        int resA = ropeCuttingProblem(n-a, a, b, c);
        int resB = ropeCuttingProblem(n-b, a, b, c);
        int resC = ropeCuttingProblem(n-c, a, b, c);

        int max = Math.max(resA, Math.max(resB, resC));

        if(max==-1){
            return -1;
        }

        return max+1;
    }

    private static int ropeCuttingProblem1(int n, int a, int b, int c) {

        return helper( n, a, b, c,-1, -1);

    }

    private static int helper(int n, int a, int b, int c, int curr, int max){
        if(n<=0){
            if(n==0){
                return Math.max(curr, max);
            }

            return max;
        }

        max = Math.max(helper(n-a, a, b, c, curr+1, max), max);
        max = Math.max(helper(n-b, a, b, c, curr+1, max), max);
        max = Math.max(helper(n-c, a, b, c, curr+1, max), max);

        return max;
    }
}
