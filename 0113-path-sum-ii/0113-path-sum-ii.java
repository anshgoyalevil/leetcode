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
    List<List<Integer>> ans = new ArrayList<>();

    List<Integer> m = new ArrayList<>();

    public void f(TreeNode root, int t, int ps) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            m.add(root.val);

            ps += root.val;
            if (ps == t) {
                ArrayList<Integer> mc = new ArrayList<>(m);
                ans.add(mc);
            }
            m.remove(m.size() - 1);
        }
        m.add(root.val);
        f(root.left, t, ps + root.val);
        m.remove(m.size() - 1);
        m.add(root.val);
        f(root.right, t, ps + root.val);
        m.remove(m.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        f(root, targetSum, 0);
        return ans;
    }
}
