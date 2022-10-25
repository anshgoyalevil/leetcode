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
    
    ArrayList<Integer> arr = new ArrayList<>();
    
    public void p(TreeNode root){
        if(root!=null){
            arr.add(root.val);
            p(root.left);
            p(root.right);
        }
    }
    
    public void flatten(TreeNode root) {
        
        p(root);
        if(arr.size()==0){
            return;
        }
        
        root.val = arr.get(0);
        root.left = null;
        
        //TreeNode it = root;
        
        for(int i = 1; i<arr.size(); i++){
            TreeNode nx = new TreeNode(arr.get(i));
            root.right = nx;
            root.left = null;
            root=root.right;
        }
        
    }
}