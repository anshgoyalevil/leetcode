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
    int c = 0;
    ArrayList<Integer> arr = new ArrayList<>();
    public int h(TreeNode root){
        if(root == null){
            return -1;
        }
        return Math.max(h(root.left), h(root.right))+1;
    }
    
    public void kd(TreeNode root, int k){
        if(root == null || k<0){
            return;
        }
        if(k == 0){
            c++;
        }
        kd(root.left, k-1);
        kd(root.right, k-1);
    }
    
    public void kdr(TreeNode root, int k){
        if(k < 0){
            return;
        }
        if(root == null && k == 0){
            arr.add(-1);
        }
        if(root == null){
            return;
        }
        if(k==0){
            arr.add(root.val);
        }
        kdr(root.left, k-1);
        kdr(root.right, k-1);
    }
    
    public boolean isCompleteTree(TreeNode root) {
        int h = h(root);
        int a = 1;
        for(int i = 0; i<h; i++){
            c = 0;
            kd(root, i);
            if(c!=a){
                return false;
            }
            a=a*2;
        }
        kdr(root, h);
        boolean stb = false;
        for(int i = arr.size()-1; i>-1; i--){
            if(arr.get(i) != -1){
                stb = true;
            }
            if(stb && arr.get(i) == -1){
                return false;
            }
        }
        //System.out.println(arr);
        return true;
    }
}