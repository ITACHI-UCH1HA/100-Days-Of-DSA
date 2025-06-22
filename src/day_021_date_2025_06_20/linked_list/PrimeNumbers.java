package day_021_date_2025_06_20.linked_list;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 100;
        findPrimes(num);
    }

    private static void findPrimes(int num) {
        for (int i = 1; i < 100; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num){

        if(num==1){
            return false;
        }

        for(int i=2; i<num/2; i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
