class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int num = 0;
        
        for(int i = 0; i<s.length()-1; i++){
            int a = hm.get(s.charAt(i));
            int b = hm.get(s.charAt(i+1));
            
            if(a < b){
                num = num - a;
            }
            else if(a > b){
                num = num + a;
            }
            else if(a == b){
                num = num + a;
            }
            
        }
        
        num = num + hm.get(s.charAt(s.length()-1));
        
        return num;
        
    }
}