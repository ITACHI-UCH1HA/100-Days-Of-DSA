package Day_004_Date_2024_06_30.Recurssion;

class PrintNumbers {
    public static void main(String[] args) {
        System.out.println(printProductOfdigits(9112));
    }

    private static int printProductOfdigits(int num) {
//        if(num>0 && num<10){
//            return num;
//        }
        if((num%10)==num){
            return num;
        }
        return (num%10)*printProductOfdigits(num/10);
    }

    private static int printSumOfdigits(int num) {
        if(num==0){
            return num;
        }
        return (num%10)+printSumOfdigits(num/10);
    }

    private static int printSumOf1ToN(int num) {
        if(num==1){
            return num;
        }
        return num+printSumOf1ToN(num-1);
    }

    private static int printProductOf1ToN(int num) {
        if(num==1){
            return num;
        }
        return num*printProductOf1ToN(num-1);
    }

    private static void print_1ToN(int num) {
        if(num==1){
            System.out.println(num+" ");
            return;
        }
        print_1ToN(num-1);
        System.out.println(num+" ");
    }

    private static void printNTo1(int num) {
        if(num==1){
            System.out.println(num+" ");
            return;
        }
        System.out.print(num+" ");
        printNTo1(num-1);
    }
}
