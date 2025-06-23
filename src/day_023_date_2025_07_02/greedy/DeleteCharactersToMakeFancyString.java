package day_023_date_2025_07_02.greedy;

//https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/?envType=daily-question&envId=2025-07-21

public class DeleteCharactersToMakeFancyString {
    public static void main(String[] args) {
        String s = "aaabaaaa";
        System.out.println(makeFancyString(s));
    }
    public static String makeFancyString(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if(count>=2 && s.charAt(i-1)==s.charAt(i)){
                continue;
            }

            if(s.charAt(i-1)==s.charAt(i)){
                count++;
                builder.append(s.charAt(i));
            }else{
                count=1;
                builder.append(s.charAt(i));
            }
        }

        return builder.toString();
    }
}
