package Day_004_Date_2024_06_30.Recurssion;

class ReverseANumber {
    static int sum=0;
    public static void main(String[] args) {
        System.out.println(reverseNumber(1123));
    }
    private static int reverse(int num){
        int sum=0;
        while (num>0){
            int rem= num%10;
            sum= sum*10+rem;
            num/=10;
        }

        return sum;
    }
    private static int reverseNumber(int num) {
        if(num==0){
            return num;
        }
        int rem= num%10;
        sum= sum*10+rem;
        reverseNumber(num/10);
        return sum;
    }
}
