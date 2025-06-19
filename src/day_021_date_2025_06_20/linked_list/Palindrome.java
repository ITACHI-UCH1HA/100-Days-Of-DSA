package day_021_date_2025_06_20.linked_list;

//https://leetcode.com/problems/valid-palindrome/description/

public class Palindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {


        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        int i= 0 , j = s.length()-1;
        System.out.println(s);
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1!=ch2){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
