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
    int ans = 0;
    int[] fr = new int[10];

    public void check() {
        int odd = 0;
        for (int i = 0; i < 10; i++) {
            if (fr[i] % 2 != 0) {
                odd++;
            }
        }
        if (odd <= 1) {
            ans++;
        }
    }

    public void f(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            fr[root.val]++;
            check();
            fr[root.val]--;
        }
        fr[root.val]++;
        f(root.left);
        fr[root.val]--;
        fr[root.val]++;
        f(root.right);
        fr[root.val]--;
    }

    public int pseudoPalindromicPaths(TreeNode root) {
        f(root);
        return ans;
    }
}
