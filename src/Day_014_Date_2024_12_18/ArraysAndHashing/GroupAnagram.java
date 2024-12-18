package Day_014_Date_2024_12_18.ArraysAndHashing;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String strs[] = { "eat","tea","tan","ate","nat","bat" };

        System.out.println(groupAnagrams(strs));

    }
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();

        int n = strs.length;

        for (int i = 0; i < n; i++) {
            char[] chars = strs[i].toCharArray();
            
        }

        return list;
    }
}
