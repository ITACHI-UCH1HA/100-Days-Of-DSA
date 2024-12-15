package Day_006_Date_2024_07_15;

import java.util.*;

public class KthDistinct {
    public static void main(String[] args) {
        String[] arr= {"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr, 2));
    }
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String , Integer> map= new HashMap<>();
        for(String s: arr){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        return "";
    }
}
