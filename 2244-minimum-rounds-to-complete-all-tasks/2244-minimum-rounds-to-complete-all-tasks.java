class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        for(int i = 0; i<tasks.length; i++){
            hm.put(tasks[i], hm.getOrDefault(tasks[i], 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> e: hm.entrySet()){
            if(e.getValue() >= 2){
                int a = e.getValue();
                if(a%3==0){
                    ans+=a/3;
                }
                else if(a%3==1){
                    int r = a-4;
                    ans+=2;
                    ans+=r/3;
                }
                else if(a%3==2){
                    ans+=1;
                    ans+=(a-2)/3;
                }
            }
            else{
                return -1;
            }
        }
        return ans;
    }
}