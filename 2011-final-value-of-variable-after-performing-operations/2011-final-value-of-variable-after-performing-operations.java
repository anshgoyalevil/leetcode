class Solution {
    public int finalValueAfterOperations(String[] ops) {
        
        int a = 0;
        
        for(int i = 0; i<ops.length; i++){
            if(ops[i].charAt(0) == '+' || ops[i].charAt(2) == '+'){
                a++;
            }
            else{
                a--;
            }
        }
  return a;      
    }
}