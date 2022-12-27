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
    
    int h = 0;
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public int h(TreeNode root){
        if(root == null){
            return -1;
        }
        return Math.max(h(root.left), h(root.right))+1;
    }
    
    List<List<Integer>> tmp = new ArrayList<>();
    
    public void kd(TreeNode root, int k, int c){
        if(root == null || k<0){
            return;
        }
        if(k == 0){
            tmp.get(c+h).add(root.val);
        }
        kd(root.left, k-1, c-1);
        kd(root.right, k-1, c+1);
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        h = h(root);
        int d = (2*h) + 1;
        for(int i = 0; i<d; i++){
            ans.add(new ArrayList<>());
        }
        
        for(int j = 0; j<=h; j++){
            tmp.clear();
            for(int i = 0; i<d; i++){
                tmp.add(new ArrayList<>());
            }
            kd(root, j, 0);
            for(int i = 0; i<d; i++){
                Collections.sort(tmp.get(i));
                ans.get(i).addAll(tmp.get(i));
            }
        }
        
        for(int i = 0; i<d; i++){
            if(ans.get(i).size() == 0){
                ans.remove(i);
                d--;
                i--;
            }
        }
        return ans;
    }
}