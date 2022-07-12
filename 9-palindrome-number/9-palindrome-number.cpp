class Solution {
public:
    bool isPalindrome(int x) {
        
        string str = "-121";
        bool b = true;
        
        if(x >= 0){
             str = to_string(x);
        }
      
        
        int y = (str.length())/2;
            
        int z = str.length();
        
        int n = 0;
            
            for(int i = 0; i<y; i++){
                
                if(str.at(i) == str.at(z-1-i)){
                    
                    n++;
                    
                }
                
            }
        
        
        if(y == 0){
            b = true;
        }
        
            else if(n== y){
                b= true;
            }
        
        else {
            b = false;
        }
        
        return b;
        
    }
};