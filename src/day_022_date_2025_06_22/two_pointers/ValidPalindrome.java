package day_022_date_2025_06_22.two_pointers;

//https://leetcode.com/problems/valid-palindrome/description/

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;

        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while (i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome1(String s) {
        StringBuilder str = new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }

        String cleaned = str.toString();
        String reversed = str.reverse().toString();

        return cleaned.equals(reversed);
    }
    public static boolean isPalindrome2(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        int i=0, j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
