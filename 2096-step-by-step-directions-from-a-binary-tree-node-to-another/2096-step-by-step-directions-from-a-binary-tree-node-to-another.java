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

    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode temp = commonnode(root, startValue, destValue);
        StringBuilder sb = new StringBuilder();
        upTravel(sb, temp, startValue);
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder();
        downTravel(sb2, temp, destValue);
        System.out.println(sb2);
        return sb.toString() + sb2.reverse().toString();
    }

    public TreeNode commonnode(TreeNode root, int s, int e) {
        if (root == null) return null;
        if (root.val == s) return root;
        if (root.val == e) return root;

        TreeNode l = commonnode(root.left, s, e);
        TreeNode r = commonnode(root.right, s, e);

        if (l != null && r != null) return root;
        if (l != null) return l;
        if (r != null) return r;
        return null;
    }

    public boolean upTravel(StringBuilder sb, TreeNode root, int s) {
        if (root == null) return false;
        if (root.val == s) return true;
        boolean left = upTravel(sb, root.left, s);
        if (left == true) sb.append('U');
        if (left == true) return true;
        boolean right = upTravel(sb, root.right, s);
        if (right == true) sb.append('U');
        return right;
    }

    public boolean downTravel(StringBuilder sb, TreeNode root, int e) {
        if (root == null) return false;
        if (root.val == e) return true;
        boolean left = downTravel(sb, root.left, e);
        if (left == true) sb.append('L');
        if (left == true) return true;
        boolean right = downTravel(sb, root.right, e);
        if (right == true) sb.append('R');
        return right;
    }
}
