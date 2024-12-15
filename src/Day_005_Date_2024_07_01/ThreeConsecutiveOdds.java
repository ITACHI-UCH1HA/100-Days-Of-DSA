package Day_005_Date_2024_07_01;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr= {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                counter++;
                if(counter==3){
                    return true;
                }
            }else{
                counter=0;
            }
        }
        return false;
    }
}
