package Day_002_Date_2024_06_21;

public class CeilTheFloor {
    static class Pair{
        int ceil;
        int floor;
        Pair(){
            this.ceil=-1;
            this.floor=-1;
        }
        Pair(int ceil, int floor){
            this.ceil=ceil;
            this.floor=floor;
        }
    }
    public static void main(String[] args) {
        int[] arr={5, 6, 8, 9, 6, 5, 5, 6};
        Pair pair= getFloorAndCeil(arr, arr.length, 10);
        System.out.println(pair.floor+" "+pair.ceil);
    }
    public static Pair getFloorAndCeil(int[] arr, int n, int x) {
        Pair pair= new Pair();
        pair.ceil=Integer.MAX_VALUE;
        pair.floor=Integer.MIN_VALUE;

        boolean foundCeil=false;
        boolean foundFloor=false;

        for(int num:arr){
            if(num>x && num<pair.ceil){
                pair.ceil=num;
                foundCeil=true;
            }
            if(num<x && num> pair.floor){
                pair.floor=num;
                foundFloor=true;
            }
        }
        if(!foundCeil){
            pair.ceil=-1;
        }
        if(!foundFloor){
            pair.floor=-1;
        }
        return pair;
    }
}
