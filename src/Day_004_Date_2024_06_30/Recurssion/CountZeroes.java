package Day_004_Date_2024_06_30.Recurssion;

class CountZeroes {
    public static void main(String[] args) {
        int num= 100020;
        System.out.println(countZeroes(num));
    }

    private static int countZeroes(int num) {
        if(num==0){
            return 0;
        }
        int rem= num%10;
        if(rem==0){
            return 1+countZeroes(num/10);
        }
        return countZeroes(num/10);
    }
}
