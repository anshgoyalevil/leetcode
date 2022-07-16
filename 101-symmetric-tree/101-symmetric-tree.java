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
    
    List<List<Integer>> ls = new ArrayList<>();
    
    public int depth(TreeNode root){
        
        if(root == null){
            return 0;
        }
        
        return Math.max(depth(root.left), depth(root.right)) + 1;
        
    }
    
    public void level(TreeNode root, int k, int ind){
        
        if(root == null && k == 0){
            ls.get(ind).add(200);
        }
        if(root == null) return;
        if(k == 0){
            ls.get(ind).add(root.val);
        }
        else{
            level(root.left, k-1, ind);
            level(root.right, k-1, ind);
        }
        
    }
    
    public boolean isSymmetric(TreeNode root) {
        
        int height = depth(root);
        
        for(int i = 0; i<height; i++){
        ls.add(new ArrayList<>());
    }

        for(int i = 0; i<height; i++){
            
            level(root, i, i);
            
        }
        
        System.out.println(ls);
        
        int flag = 0;
        
        outer:
        for(int i = 0; i<ls.size(); i++){
        
            for(int j = 0; j <= (ls.get(i).size())/2 && (ls.get(i).size()) != 0; j++){
                System.out.println(j + " " + i);
                if(Objects.equals(ls.get(i).get(j), ls.get(i).get(ls.get(i).size() - 1 - j))){
                    flag = 0;
                }
                else{
                    flag = 1;
                    break outer;
                }
            }
            
        }
        
        if(flag == 1){
            return false;
        }
        else{
            return true;
        }
        
    }
    
    
    
}