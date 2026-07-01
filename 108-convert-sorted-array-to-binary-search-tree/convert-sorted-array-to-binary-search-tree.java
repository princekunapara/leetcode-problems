/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode makeTree(TreeNode root, int start, int end, int mid, int[] nums) {
        
        if(root == null) {
            root = new TreeNode(nums[mid]);
        }
        if(mid != start) {
            root.left = makeTree(root.left, start, mid - 1, (start + (mid-1)) / 2, nums);
        }
        
        
        if(mid != end) {
            root.right = makeTree(root.right, mid + 1, end, ((mid+1) + end) / 2, nums);
        }
        

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        return makeTree(root, start, end, mid, nums);
    }
}