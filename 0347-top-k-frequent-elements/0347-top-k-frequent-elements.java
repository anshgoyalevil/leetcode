class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        
        int [] ans = new int [k];
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1, 
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        
        int it = 0;
        
        for (Map.Entry<Integer, Integer> aa : list) {
            ans[it] = aa.getKey();
            it++;
            if(it == k){
                break;
            }
        }
        return ans;
    }
}