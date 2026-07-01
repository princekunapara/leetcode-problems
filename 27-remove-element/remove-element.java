class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        int[] nums2 = new int[nums.length];

        for(int i=0; i<nums2.length; i++) {
            nums2[i] = Integer.MAX_VALUE;
        }

        if(nums.length == 0) {
            return k;
        }
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums[i] == val) {
                    break;
                }
                else if(nums[i] != val && nums2[j] == Integer.MAX_VALUE) {
                    nums2[j] = nums[i];
                    k++;
                    break;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            nums[i] = nums2[i];
        }
        return k;
    }
}