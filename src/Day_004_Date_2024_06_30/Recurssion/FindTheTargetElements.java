package Day_004_Date_2024_06_30.Recurssion;

import java.util.ArrayList;

public class FindTheTargetElements {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,4,3,4,3};
        ArrayList<Integer> list= findTheTargetElements(nums, 3, 0);
        System.out.println(list);
    }
    public static ArrayList<Integer> findTheTargetElements(int[] nums, int target, int index){
        if(index== nums.length){
            return new ArrayList<>();
        }
        if(nums[index]==target){
            ArrayList<Integer> list= findTheTargetElements(nums, target, index+1);
            list.addFirst(index);
            return list;
        }
        return findTheTargetElements(nums, target, ++index);
    }
}
