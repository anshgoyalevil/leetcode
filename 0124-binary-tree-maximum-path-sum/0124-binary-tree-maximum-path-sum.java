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
    int res = 0;
    public int maxPathSum(TreeNode root) {
        res = root.val;
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root){
        if(root == null) return 0;

        int maxL = dfs(root.left);
        int maxR = dfs(root.right);

        maxL = Math.max(maxL, 0);
        maxR = Math.max(maxR, 0);

        res = Math.max(res, root.val + maxL + maxR);

        return root.val + Math.max( maxL, maxR);
    }
}