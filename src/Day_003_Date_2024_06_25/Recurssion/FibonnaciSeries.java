package Day_003_Date_2024_06_25.Recurssion;

class FibonnaciSeries {
    public static void main(String[] args) {
        int num=fibonnaci(3);
        System.out.println(num);
    }

    private static int fibonnaci(int num) {
        if(num<2){
            return 1;
        }

        return fibonnaci(num-1)+fibonnaci(num-2);
    }
}
