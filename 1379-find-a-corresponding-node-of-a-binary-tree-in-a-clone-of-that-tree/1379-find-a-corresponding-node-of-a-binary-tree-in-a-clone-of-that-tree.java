/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    TreeNode ans;
    
    public TreeNode sol(TreeNode original, TreeNode cloned, TreeNode target){
        if(cloned!=null){
            sol(original, cloned.left, target);
            if(cloned.val == target.val){
                ans = cloned;
            }
            sol(original, cloned.right, target);
        }
        
        return null;
    }
    
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
        sol(original, cloned, target);
        
        return ans;
        
    }
}