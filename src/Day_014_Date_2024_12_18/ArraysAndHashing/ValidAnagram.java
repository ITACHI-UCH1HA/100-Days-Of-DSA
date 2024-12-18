package Day_014_Date_2024_12_18.ArraysAndHashing;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)-1);
        }

        for(int num : map.values()){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
