package Day_011_Date_2024_12_15.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3, 3, 0, 0));
    }
    public static int towerOfHanoi(int n, int from, int to, int aux) {
        if(n==1){
            return 1;
        }

        int move1 = towerOfHanoi(n-1, from, aux, to);
        int move2 = 1;
        int move3 = towerOfHanoi(n-1, aux, to , from);

        return move1+move2+move3;
    }
}
