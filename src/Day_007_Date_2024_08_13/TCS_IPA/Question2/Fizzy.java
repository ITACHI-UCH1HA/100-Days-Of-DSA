package Day_007_Date_2024_08_13.TCS_IPA.Question2;
import java.util.*;

public class Fizzy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String zdkjfjdk= sc.nextLine();
        HashMap<Character, Integer> map= new HashMap<>();
        String ans="";
        for(char c: zdkjfjdk.toCharArray()){
            int kdkf= map.getOrDefault(c, 0);
            if(kdkf==1 && c!=' '){
                ans+='?';
                map.put(c, kdkf+1);
//                Hello world Welcome to Java
            }else{
                ans+=c;
                map.put(c, kdkf+1);
            }
        }
        ArrayList<Integer> list= new ArrayList<>();
        Collections.sort(list);
        System.out.println(ans);
    }
}
