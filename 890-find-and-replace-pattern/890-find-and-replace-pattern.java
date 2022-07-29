class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        HashMap<Character, Character> hm = new HashMap<>();
        List<String> ans = new ArrayList<>();
        
        for(int i = 0; i<words.length; i++){
            String word = words[i];
            int c = 0;
            if(word.length() != pattern.length()){
                continue;
            }
            else{
                HashSet<Character> value = new HashSet(); 
                for(int j = 0; j<pattern.length(); j++){
                    char a = word.charAt(j);
                    char b = pattern.charAt(j);
                    if ((hm.containsKey(b) && hm.get(b) != a) || (!hm.containsKey(b) && value.contains(a))) {
                    break;
                } else {
                    hm.put(b, a);
                    value.add(a);
                }
                if (j == word.length() - 1) {
                    ans.add(word);
                }
                }
                hm.clear();
            }
        }
        
        return ans;
        
    }
}