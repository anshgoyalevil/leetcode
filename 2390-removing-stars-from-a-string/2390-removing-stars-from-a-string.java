class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack<>();
        
        st.add(s.charAt(0));
        
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                st.pop();
            }
            else{
                st.add(s.charAt(i));
            }
        }
        
        String ans = "";
        
        int l = st.size();
        
        for(int i = 0; i<l; i++){
            ans=st.pop()+ans;
        }
        return ans;
    }
}