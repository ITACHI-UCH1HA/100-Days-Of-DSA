package Day_011_Date_2024_12_15.recursion;

import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        ArrayList<ArrayList<Integer>> subSets = subsets(arr);

//        System.out.println(new ArrayList<>());

        for(ArrayList<Integer> list: subSets){
            System.out.println(list);
        }

    }
    public static ArrayList<ArrayList<Integer>> subsets(int arr[]) {

        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        return helper(arr,0, answer);

    }
    public static ArrayList<ArrayList<Integer>> helper(int[] arr, int index, ArrayList<ArrayList<Integer>> list){
        if(index >= arr.length){
            return list;
        }




        return helper(arr, index+1, list);
    }
}
