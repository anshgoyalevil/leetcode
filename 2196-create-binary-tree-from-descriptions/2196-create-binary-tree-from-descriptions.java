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
    public TreeNode createBinaryTree(int[][] d) {
        
        HashMap<Integer, TreeNode> hm = new HashMap<>();
        
        TreeNode root = null;
        
        for(int i = 0; i<d.length; i++){
            if(!hm.containsKey(d[i][0])){
                TreeNode p = new TreeNode(d[i][0]);
                root = p;
                hm.put(d[i][0], p);
                if(!hm.containsKey(d[i][1])){
                    TreeNode ch = new TreeNode(d[i][1]);
                    if(d[i][2] == 1){
                        p.left = ch;
                    }
                    else{
                        p.right = ch;
                    }
                    hm.put(d[i][0], p);
                    hm.put(d[i][1], ch);
                }
                else{
                    TreeNode ch = hm.get(d[i][1]);
                    if(d[i][2] == 1){
                        p.left = ch;
                    }
                    else{
                        p.right = ch;
                    }
                    hm.put(d[i][0], p);
                }
            }
            else {
                TreeNode p = hm.get(d[i][0]);
                if(!hm.containsKey(d[i][1])){
                    TreeNode ch = new TreeNode(d[i][1]);
                    if(d[i][2] == 1){
                        p.left = ch;
                    }
                    else{
                        p.right = ch;
                    }
                    hm.put(d[i][0], p);
                    hm.put(d[i][1], ch);
                }
                else{
                    TreeNode ch = hm.get(d[i][1]);
                    if(d[i][2] == 1){
                        p.left = ch;
                    }
                    else{
                        p.right = ch;
                    }
                    hm.put(d[i][0], p);
                }
            }
            
        }
        for(int i = 0; i<d.length; i++){
            hm.remove(d[i][1]);
        }
        
        for(Map.Entry<Integer, TreeNode> e: hm.entrySet()){
            return e.getValue();
        }
        return null;
    }
}