class Solution {
    public int wateringPlants(int[] plants, int cap) {
        
        int ans = 0;
        
        int c = cap;
        
        for(int i = 0; i<plants.length; i++){
            if(c>=plants[i]){
                ans++;
                c-=plants[i];
            }
            else{
                ans+=i;
                ans+=i+1;
                c = cap-plants[i];
            }
        }
        return ans;
    }
}