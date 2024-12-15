package Day_005_Date_2024_07_01.Recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1= {1,2,2,1};
        int[] nums2= {2,2};
        System.out.println(Arrays.toString(intersectionOfArrays(nums1, nums2)));
    }

    private static int[] intersectionOfArrays(int[] nums1, int[] nums2) {
        List<Integer> list= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        int len1= nums1.length;
        int len2= nums2.length;
        for (int i = 0; i < len1; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i],0));
        }
        for (int i = 0; i < len2; i++) {
            int key= nums2[i];
            if(map.containsKey(key) && map.get(key)>0){
                list.add(key);
                map.put(key, map.get(key)-1);
            }
        }
        int[] nums=convertListToInt(list);

        return nums;
    }

    private static int[] convertListToInt(List<Integer> list) {
        int[] nums= new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i]= list.get(i);
        }
        return nums;
    }
}
