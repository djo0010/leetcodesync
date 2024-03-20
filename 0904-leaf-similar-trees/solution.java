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
import java.util.ArrayList;
import java.util.Objects;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList<Integer> vals1 = new ArrayList<Integer>();
        ArrayList<Integer> vals2 = new ArrayList<Integer>();
        leafSimilarHelper(root1, vals1);
        leafSimilarHelper(root2, vals2);
        if (vals1.size() != vals2.size()) return false;
        for (int i = 0; i < vals1.size(); i++) {
            if (!Objects.equals(vals1.get(i), vals2.get(i))) return false;
        }
        return true;
    }

    private void leafSimilarHelper(TreeNode root, ArrayList<Integer> vals) {
        if (root == null) return;
        if (root.left == null && root.right == null) vals.add(root.val);
        leafSimilarHelper(root.left, vals);
        leafSimilarHelper(root.right, vals);
    }
}
