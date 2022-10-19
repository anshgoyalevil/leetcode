class Solution {
    public String evaluate(String s, List<List<String>> k) {
        
        HashMap<String, String> hm = new HashMap<>();
        
        for(int i = 0; i<k.size(); i++){
            hm.put(k.get(i).get(0), k.get(i).get(1));
        }
        
        String ans = "";
        
        for(int i = 0; i<s.length(); ){
            if(s.charAt(i) == '('){
                String med = "";
                for(int j = i+1; j<s.length(); j++){
                    if(s.charAt(j) == ')'){
                        i = j+1;
                        break;
                    }
                    else{
                        med+=s.charAt(j);
                    }
                }
                if(hm.containsKey(med)){
                    ans+=hm.get(med);
                }
                else{
                    ans+='?';
                }
            }
            else{
                ans+=s.charAt(i);
                i++;
            }
        }
        return ans;
    }
}