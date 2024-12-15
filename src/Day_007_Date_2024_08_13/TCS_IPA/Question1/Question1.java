package Day_007_Date_2024_08_13.TCS_IPA.Question1;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s= sc.nextLine();

        int count= findWords(s);
        if(count==0){
            System.out.println("No String found");
        }else{
            System.out.println(count);
        }
    }

    private static int findWords(String s) {
        String[] S= s.split(" ");
        int count=0;
        for(String word: S){
            char c= word.charAt(0);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
            c=='A' || c=='E' || c=='I' || c=='O' || c=='U'
            ){
                count++;
            }
        }
        return count;
    }
}
