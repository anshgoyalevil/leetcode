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
    
    int mx = -1;
    
    public void tr(TreeNode root, boolean left){
        int m = -1;
        int i = 0;
        while(root!=null){
            if(i%2==0 && left){
                root.val = -1;
                root=root.left;
                m++;
                i++;
            }
            else if(i%2!=0 && left){
                root.val = -2;
                root=root.right;
                m++;
                i++;
            }
            else if(i%2==0 && left == false){
                root.val = -2;
                root=root.right;
                m++;
                i++;
            }
            else if(i%2!=0 && left == false){
                root.val = -1;
                root=root.left;
                m++;
                i++;
            }
        }
        mx = Math.max(mx, m);
    }
    
    public void f(TreeNode root){
        if(root!=null){
            if(root.val!=-1 && root.val!=-2){
                
                tr(root, true);
                tr(root, false);
            }
            else if(root.val == -1){
                tr(root, false);
            }
            else if(root.val == -2){
                tr(root, true);
            }
            
            f(root.left);
            f(root.right);
        }
    }
    
    public int longestZigZag(TreeNode root) {
        
        f(root);
        return mx;
        
    }
}