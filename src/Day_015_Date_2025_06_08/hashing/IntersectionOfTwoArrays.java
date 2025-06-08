package Day_015_Date_2025_06_08.hashing;

import java.util.*;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list= new ArrayList<>();
        
        HashSet<Integer> set= new HashSet<>();
        
        for(int num: nums1) {
        	set.add(num);
        }
        
        for(int num:nums2) {
        	if(set.contains(num)) {
        		list.add(num);
        		set.remove(num);
        	}
        }
        int[] ans = new int[list.size()];
        for(int i=0; i< list.size(); i++) {
        	ans[i] = list.get(i);
        }
        return ans;
    }
}
