package Day_004_Date_2024_06_30.BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums= {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }

    private static int findPeakElement(int[] nums) {
        int l = 0, h = nums.length - 1;

        while (l < h) {
            int m = l + (h - l) / 2;

            if (nums[m] > nums[m + 1]) {
                // If mid element is greater than the next element, then the peak lies on the left side (including mid)
                h = m;
            } else {
                // If mid element is smaller than the next element, then the peak lies on the right side (excluding mid)
                l = m + 1;
            }
        }

        // When l == h, we have found the peak element index
        return l;
    }
}
