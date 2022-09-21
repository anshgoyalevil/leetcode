class Solution {
    public int minSteps(String s, String t) {
        
        int ans = 0;
        
        int [] a1 = new int [26];
        int [] a2 = new int [26];
        
        for(int i = 0; i<s.length(); i++){
            a1[s.charAt(i)-97]++;
        }
        
        for(int i = 0; i<t.length(); i++){
            a2[t.charAt(i)-97]++;
        }
        
        for(int i = 0; i<26; i++){
            ans+=Math.abs(a1[i]-a2[i]);
        }
        return ans;
    }
}