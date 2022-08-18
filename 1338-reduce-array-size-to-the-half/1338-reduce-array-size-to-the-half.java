class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        ArrayList<Integer> fr = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            fr.add(entry.getValue());
        }
        
        Collections.sort(fr);
        
        int rem = 0;
        
        int e = 0;
        
        for(int i = fr.size()-1; i>-1; i--){
            if(rem>=(arr.length+1)/2){
                return e;
            }
            else{
                e++;
                rem+=fr.get(i);
            }
        }
        
        return e;
        
    }
}