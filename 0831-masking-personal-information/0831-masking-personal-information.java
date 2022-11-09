class Solution {
    public String maskPII(String s) {
        
        if(s.indexOf('@')!=-1){
            String em = s.toLowerCase();
            char f = em.charAt(0);
            char l = em.charAt(em.indexOf('@')-1);
            String rst = em.substring(s.indexOf('@')+1);
            return f+"*****"+l+'@'+rst;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9){
                arr.add(s.charAt(i)-'0');
            }
        }
        
        int rs = arr.size()-10;
        
        String ans = "";
        
        int i = 0;
        
        if(rs>0){
            ans+='+';
            for(i = 0; i<rs; i++){
            ans+='*';
        }
            ans+='-';
        }
        
        for(;i<arr.size()-7; i++){
            ans+='*';
        }
        ans+='-';
        for(;i<arr.size()-4; i++){
            ans+='*';
        }
        ans+='-';
        for(;i<arr.size(); i++){
            ans+=arr.get(i);
        }
        
        return ans;
    }
}