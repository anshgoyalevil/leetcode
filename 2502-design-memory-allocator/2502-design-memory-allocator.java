class Allocator {
    
    int [] arr;
    int n;

    public Allocator(int sz) {
        arr = new int [sz];
        n = sz;
    }
    
    public int allocate(int size, int mID) {
        int len = 0;
        int st = -1;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                if(st == -1){
                    st = i;
                }
                len++;
                if(size == len){
                    int r = st;
                    for(int j = st; j<r+size; j++){
                        arr[j] = mID;
                    }
                    return st;
                }
            }
            else{
                len = 0;
                st = -1;
            }
        }
        return -1;
    }
    
    public int free(int mID) {
        
        int c = 0;
        
        for(int i = 0; i<n; i++){
            if(arr[i] == mID){
                c++;
                arr[i] = 0;
            }
        }
        
        return c;
        
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.free(mID);
 */