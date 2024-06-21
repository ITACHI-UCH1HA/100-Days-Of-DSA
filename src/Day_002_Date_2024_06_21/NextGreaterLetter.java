package Day_002_Date_2024_06_21;

public class NextGreaterLetter {
    public static void main(String[] args) {
        char[] Letters={'c','f','j'};
        System.out.println(nextGreatestLetter(Letters, 'c'));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int len= letters.length;
        int l=0, h= len-1;

        while(l<=h){
            int m= l+(h-l)/2;
            if(letters[m]==target){
                l=m+1;
            }else if(letters[m]< target){
                l= m+1;
            }else{
                h=m-1;
            }
        }
        return letters[l%len];
    }
}
