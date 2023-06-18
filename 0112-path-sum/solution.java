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
    public static boolean hasPathSum(TreeNode root, int targetSum) {
      if (root == null) 
         return false;
      return helper(root, targetSum, root.val);
   }      
   
   public static boolean helper(TreeNode node, int target, int currVal) {
      if (currVal == target && node.left == null && node.right == null) 
         return true;
      if (node.left == null && node.right == null) 
         return false;
      boolean left = false;
      boolean right = false;
      if (node.left != null) 
         left = helper(node.left, target, currVal + node.left.val);
      if (node.right != null) right = helper(node.right, target, currVal + node.right.val);
      return left || right;
   }
}
