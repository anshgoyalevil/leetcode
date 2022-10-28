class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<int[]> arr = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            arr.add(new int[26]);
        }

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                arr.get(i)[strs[i].charAt(j) - 97]++;
            }
        }

        List<List<String>> ans = new ArrayList<>();

        int x = -1;

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) != null) {
                ans.add(new ArrayList<>());
                x+=1;
                ans.get(x).add(strs[i]);
            }
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != null && arr.get(j) != null) {
                    if (Arrays.equals(arr.get(i), arr.get(j))) {
                        ans.get(x).add(strs[j]);
                        arr.set(j, null);
                    }
                }
            }
        }

        // for(int i = 0; i<arr.size(); i++){
        //     for(int j = 0; j<26; j++){
        //         System.out.print(arr.get(i)[j]+" ");
        //     }
        //     System.out.println();
        // }
        
        if(arr.get(arr.size()-1)!=null){
            ans.add(new ArrayList<>());
            x+=1;
            ans.get(x).add(strs[strs.length-1]);
        }

        return ans;
    }
}
