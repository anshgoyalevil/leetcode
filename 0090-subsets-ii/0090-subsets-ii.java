class Solution {
    
    HashSet<List<Integer>> hs = new HashSet<>();
    
    public void f(ArrayList<Integer> m, int id, int [] nums){
        
        ArrayList<Integer> md = new ArrayList<>(m);
        Collections.sort(md);
        hs.add(md);
        
        if(id == nums.length){
            return;
        }
        
        m.add(nums[id]);
        f(m, id+1, nums);
        m.remove(m.size()-1);
        f(m, id+1, nums);
        
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        f(new ArrayList<>(), 0, nums);
        return new ArrayList<>(hs);
    }
}