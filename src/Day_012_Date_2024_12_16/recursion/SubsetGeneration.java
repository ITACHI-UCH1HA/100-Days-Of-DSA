package Day_012_Date_2024_12_16.recursion;

import java.util.*;

public class SubsetGeneration {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        ArrayList<ArrayList<Integer>> list = subsets(arr);

        for(ArrayList<Integer> item : list){
            System.out.println(item);
        }

    }
    public static ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        return helper(arr, 0, new ArrayList<>(), list);
    }
    public static ArrayList<ArrayList<Integer>> helper(int[] arr, int index,
                                                       ArrayList<Integer> item, ArrayList<ArrayList<Integer>> list){
        if( index>= arr.length){
            list.add(item);
            return list;
        }

        helper(arr, index+1, item, list);
        item.add(arr[index]);
        helper(arr, index+1, item, list);

        return list;
    }
}
