class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    
    List<Integer> im = new ArrayList<>();
    
    public void f(int id, int k, int n){
        
        if(id == n){
            //System.out.println("Entered here");
            return;
        }
        
        //System.out.println(id + " " + k + " " + n + " From upper sout");
        
        if(im.size() == k){
            List<Integer> nl = new ArrayList<>(im);
            ans.add(nl);
            
            return;
        }
        
        for(int i = id; i<n; i++){
            im.add(i+1);
            f(i+1, k, n);
            im.remove(im.size()-1);
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        
        f(0, k, n+1);
        return ans;
        
    }
}