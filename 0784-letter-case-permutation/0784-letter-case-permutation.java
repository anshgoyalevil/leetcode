class Solution {
    
    List<String> ans = new ArrayList<>();
    
    public void f(StringBuilder m, int id){
        if(id == m.length()){
            ans.add(m.toString());
            return;
        }
        if(m.charAt(id) >= 'a' && m.charAt(id) <= 'z'){
            m.setCharAt(id, (char)(m.charAt(id)-32));
            f(m, id+1);
            m.setCharAt(id, (char)(m.charAt(id)+32));
            f(m, id+1);
        }
        else{
            f(m, id+1);
        }
    }
    
    public List<String> letterCasePermutation(String s) {

        s = s.toLowerCase();
        StringBuilder str = new StringBuilder(s);
        f(str, 0);
        return ans;
        
    }
}