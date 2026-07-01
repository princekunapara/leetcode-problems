class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                idx = i;
                return idx;
            }
        }

        for(int i=0; i<nums.length; i++) {
            if(nums[nums.length - 1] != target) {
                idx = nums.length;
            }
            if(nums[i] > target) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}