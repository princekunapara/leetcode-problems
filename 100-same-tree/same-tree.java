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
    public void inOrder(TreeNode t, List<Integer> result) {
        if(t == null) {
            return;
        }
        if(t.left == null || t.right == null) {
            result.add(-1);
        }
        inOrder(t.left, result); 
        result.add(t.val); 
        inOrder(t.right, result);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        inOrder(p, result1);
        inOrder(q, result2);

        if(result1.equals(result2)) {
            return true;
        }
        else {
            return false;
        }
    }
}