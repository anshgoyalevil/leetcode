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
    
    int mx = Integer.MIN_VALUE;
    public int h(TreeNode root) {
        if (root == null) {
            return -1;
        }
        
        return Math.max(h(root.left), h(root.right)) + 1;
    }

    public void kd(TreeNode root, int k) {
        if (k < 0 || root == null) {
            return;
        }
        if (k == 0) {
            mx = Math.max(root.val, mx);
        }
        kd(root.left, k - 1);
        kd(root.right, k - 1);
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        int h = h(root);
        for (int i = 0; i <= h; i++) {
            mx = Integer.MIN_VALUE;
            kd(root, i);
            ans.add(mx);
        }
        System.out.println(h);
        return ans;
    }
}
