class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        
        StringBuilder ans = new StringBuilder();
        
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());
 
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o2,
                               Map.Entry<Character, Integer> o1)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        for (Map.Entry<Character, Integer> aa : list) {
            for(int i = 0; i<aa.getValue(); i++){
                ans.append(aa.getKey());
            }
        }
        
        return ans.toString();
        
    }
}