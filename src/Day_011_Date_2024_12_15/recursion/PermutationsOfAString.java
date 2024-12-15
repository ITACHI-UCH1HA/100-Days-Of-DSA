package Day_011_Date_2024_12_15.recursion;

import java.util.*;

public class PermutationsOfAString {

    public static void main(String[] args) {

        String s = "";
        List<String> list  = findPermutation(s);
        System.out.println(list);

    }

    public static List<String> findPermutation(String s) {

        return helper(s, 0, new ArrayList<>());

    }

    public static List<String> helper(String s, int index, List<String> list){

        if(index>=s.length()){

            return list;

        }



        return helper(s, index+1, list);
    }
}
