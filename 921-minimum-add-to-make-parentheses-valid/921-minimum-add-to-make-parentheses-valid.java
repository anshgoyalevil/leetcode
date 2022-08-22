class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> st = new Stack<>();
        
        if(s.length() == 0){
            return 0;
        }
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(!st.isEmpty()){
                    char ch = st.peek();
                    if(ch == '('){
                        st.pop();
                    }
                    else{
                        st.add(')');
                    }
                }
                else{
                    st.push(')');
                }
            }
            else{
                st.push('(');
            }
        }
        
        return st.size();
        
    }
}