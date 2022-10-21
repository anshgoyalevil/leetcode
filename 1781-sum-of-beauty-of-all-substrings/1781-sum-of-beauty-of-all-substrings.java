class Solution {
    public int beautySum(String s) {
        
        int ans = 0;
        
        int [] c = new int [26];
        
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                c[s.charAt(j) - 'a']++;
                int mx = -1;
                int mn = Integer.MAX_VALUE;
                int ct = 0;
                for(int k = 0; k<26; k++){
                    if(c[k]!=0){
                        mx = Math.max(mx, c[k]);
                    mn = Math.min(mn, c[k]);
                        ct++;
                    }
                    
                }
                if(ct>1){
                    ans+=mx-mn;
                }
                //System.out.println(mn + " " + mx);
                //ans+=mx-mn;
            }
            for(int j = 0; j<26; j++){
                c[j] = 0;
            }
        }
        return ans;
    }
}