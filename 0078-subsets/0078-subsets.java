class Solution {
    private void solve(int index, int n, int[] nums, List<Integer> ds, List<List<Integer>> result) {
        if (index == n) {
            result.add(new ArrayList<>(ds)) ;
            return ;
        }
        
        ds.add(nums[index]) ;
        solve(index+1, n, nums, ds, result) ;
        ds.remove(ds.size()-1) ;
        solve(index+1, n, nums, ds, result) ;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>() ;
        List<Integer> ds = new ArrayList<>() ;
        int n = nums.length ;
        
        solve(0, n, nums, ds, result) ;
        return result ;
    }
}