package day_025_date_2025_08_02.recursion;
import java.util.*;
//https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
public class PermutationsOfAString {
    public static void main(String[] args) {
        String s = "ABCD";
        System.out.println(findPermutation(s));
    }
    public static ArrayList<String> findPermutation(String s) {
        return permutations("", s, new ArrayList<>());
    }
    public static ArrayList<String> permutations(String left, String right, ArrayList<String> list){

        if(right.length()==0){
            list.add(left);
            return list;
        }

        for (int i = 0; i < right.length(); i++) {
            char ch = right.charAt(i);
            String remaining = right.substring(0, i)+right.substring(i+1);
            permutations(left+ch, remaining, list);
        }

        return list;
    }
}

// ABCD
// ABDC
// ACDB
// ACBD
// ADBC
// ADCB
// BACD
// BADC
// BCAD
// BCDA
// BDAC
// BDCA
// CABD
// CADB
// CBAD
// CBDA
// CDAB
// CDBA
// DABC
// DACB
// DBAC
// DBCA
// DCAB
// DCBA
