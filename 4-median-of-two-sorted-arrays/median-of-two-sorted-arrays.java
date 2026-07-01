class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = Arrays.copyOf(nums1, nums1.length + nums2.length);

        for(int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }

        Arrays.sort(merged);

        double median;
        if(merged.length%2 == 0) {
            median =(double) (merged[(merged.length/2) - 1] + merged[(merged.length/2)])/2;
            return median;
        }
        else {
            median = (double) merged[merged.length/2];
            return median;
        }
    }
}