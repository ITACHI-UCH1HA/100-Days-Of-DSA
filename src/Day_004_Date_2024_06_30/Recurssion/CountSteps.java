package Day_004_Date_2024_06_30.Recurssion;

class CountSteps {
    public static void main(String[] args) {
        System.out.println(countSteps(8));
    }

    private static int countSteps(int num) {
        if(num==0){
            return 0;
        }
        if(num%2==0){
            return 1+countSteps(num/2);
        }else{
            return 1+countSteps(num-1);
        }
    }
}
