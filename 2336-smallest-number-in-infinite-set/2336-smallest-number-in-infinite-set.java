class SmallestInfiniteSet {
    
    int sm = 1;
    
    TreeSet<Integer> ts;

    public SmallestInfiniteSet() {
        
        ts = new TreeSet<>();
        
    }
    
    public int popSmallest() {
        
        if(ts.ceiling(0) == null){
            sm+=1;
            return sm-1;
        }
        else {
            int f = ts.ceiling(0);
            if(f<sm){
                ts.remove(f);
                return f;
            }
            else{
                sm+=1;
                return sm-1;
            }
        }
        
    }
    
    public void addBack(int num) {
        
        if(sm>num){
        ts.add(num);
        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */