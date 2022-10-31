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
    
    public void kd(TreeNode root, int k){
        if(root==null || k<0){
            return;
        }
        if(k==0){
            ans+=root.val;
        }
        kd(root.left, k-1);
        kd(root.right, k-1);
    }
    
    public void f(TreeNode root){
        if(root!=null){
            if(root.val%2==0){
                kd(root, 2);
            }
            f(root.left);
            f(root.right);
        }
    }
    
    public int sumEvenGrandparent(TreeNode root) {
        f(root);
        return ans;
    }
}