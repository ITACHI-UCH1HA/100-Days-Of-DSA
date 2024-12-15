package Day_005_Date_2024_07_01.Recurssion.Pattern;

public class RightTriangle {
    public static void main(String[] args) {
        printTriangle2(5, 0);
//        System.out.println();
    }

    private static void printTriangle2(int r, int c) {
        if(r==0){
            return;
        }
        if(c<r){
            printTriangle2(r, c+1);
            System.out.print("* ");
        }else{
            printTriangle2(r-1, 0);
            System.out.println();
        }
    }

    private static void printTriangle1(int r, int c) {
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            printTriangle1(r, c+1);
        }else{
            System.out.println();
            printTriangle1(r-1, 0);
        }
    }

    private static void printRightTriangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j >i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printRightTriangle(int num, int index) {
        if(index==0){
            return;
        }
        printStars(index);
        System.out.println();
        printRightTriangle(num, index-1);
    }

    private static void printStars(int num) {
        if(num==0){
            return;
        }
        System.out.print("* ");
        printStars(num-1);
    }
}
