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
    int mxi = 1;
    
    public int h(TreeNode root){
        if(root == null){
            return -1;
        }
        return Math.max(h(root.left), h(root.right))+1;
    }
    
    int s = 0;
    
    public void kd(TreeNode root, int k){
        if(root==null || k<0){
            return;
        }
        if(k==0){
            s+=root.val;
        }
        kd(root.left, k-1);
        kd(root.right, k-1);
    }
    
    public int maxLevelSum(TreeNode root) {
        int h = h(root);
        for(int i = 0; i<=h; i++){
            s = 0;
            kd(root, i);
            if(s>mx){
                mx = s;
                mxi = i;
            }
        }
        return mxi+1;
    }
}