package Day_015_Date_2025_06_08.hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagramHash(s, t));
    }
    public static boolean isAnagramArray(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagramHash(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.getOrDefault(map.keySet().toArray()[i], 0) != 0) {
                return false;
            }
        }
        return true;
    }
}
