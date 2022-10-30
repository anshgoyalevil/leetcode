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
    int mn = Integer.MAX_VALUE;
    int mx = Integer.MIN_VALUE;
    int ans = Integer.MIN_VALUE;
    int r = 0;

    public void f(TreeNode root) {
        if (root != null) {
            f(root.left);
            f(root.right);
            r = root.val;
            mn = Integer.MAX_VALUE;
            mx = Integer.MIN_VALUE;
            tr(root);
            ans = Math.max(ans, Math.max(Math.abs(r-mn), Math.abs(r-mx)));
        }
    }

    public void tr(TreeNode root) {
        if (root != null) {
            tr(root.left);
            tr(root.right);
            mn = Math.min(mn, root.val);
            mx = Math.max(mx, root.val);
        }
    }

    public int maxAncestorDiff(TreeNode root) {
        f(root);
        return ans;
    }
}
