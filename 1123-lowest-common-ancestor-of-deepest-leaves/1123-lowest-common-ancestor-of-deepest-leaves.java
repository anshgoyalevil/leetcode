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
    HashSet<Integer> dpst = new HashSet<>();
    TreeNode ans = null;
    int all = 0;
    int sz = 0;

    public int h(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return Math.max(h(root.left), h(root.right)) + 1;
    }

    public void kd(TreeNode root, int k) {
        if (root == null || k < 0) {
            return;
        }
        if (k == 0) {
            dpst.add(root.val);
        }
        kd(root.left, k - 1);
        kd(root.right, k - 1);
    }

    public void f(TreeNode root) {
        if (root != null) {
            
            all = 0;
            tr(root);
            if (all == sz) {
                ans = root;
            }
            f(root.left);
            f(root.right);
        }
    }

    public void tr(TreeNode root) {
        if (root != null) {
            if (dpst.contains(root.val)) {
                all++;
                //System.out.println(root.val);
            }
            tr(root.left);
            tr(root.right);
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int h = h(root);
        kd(root, h);

        sz = dpst.size();
        f(root);
        
        //System.out.println(dpst);
        return ans;
    }
}
