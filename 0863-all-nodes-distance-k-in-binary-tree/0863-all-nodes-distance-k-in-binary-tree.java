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
    
    List<TreeNode> path = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    
    public boolean pathFinder(TreeNode root, int t){
        
        if(root == null){
            return false;
        }
        
        if(root.val == t){
            path.add(root);
            return true;
        }
        
        boolean lp = pathFinder(root.left, t);
        if(lp){
            path.add(root);
            return true;
        }
        
        boolean rp = pathFinder(root.right, t);
        if(rp){
            path.add(root);
            return true;
        }
        
        return false;
        
    }
    
    public void kd(TreeNode root, int n, TreeNode blocker){
        
        if(root == null || n<0 || root == blocker){
            return;
        }
        
        if(n == 0){
            ans.add(root.val);
        }
        
        kd(root.left, n-1, blocker);
        kd(root.right, n-1, blocker);
        
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        pathFinder(root, target.val);
        
        for(int i = 0; i<path.size(); i++){
            if(i == 0){
                kd(path.get(i), k-i, null);
            }
            else{
                kd(path.get(i), k-i, path.get(i-1));
            }
        }
        return ans;
    }
}