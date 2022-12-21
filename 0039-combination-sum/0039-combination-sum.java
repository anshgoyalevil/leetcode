class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public void f(int t, int[] cd, ArrayList<Integer> im, int id){
        
        if(id == cd.length){
            if(t == 0){
                ans.add(new ArrayList<>(im));
            }
            return;
        }
        
        if(cd[id]<=t){
            im.add(cd[id]);
            f(t-cd[id], cd, im, id);
            im.remove(im.size()-1);
        }
        f(t, cd, im, id+1);
    }
    
    public List<List<Integer>> combinationSum(int[] cd, int target) {
        
        f(target, cd, new ArrayList<>(), 0);
        return ans;
        
    }
}