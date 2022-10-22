class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        List<Boolean> ans = new ArrayList<>();
        
        for(int i = 0; i<l.length; i++){
            int [] arr = new int [r[i]-l[i]+1];
            boolean sort = true;
            int it = 0;
            for(int j = l[i]; j<=r[i]; j++){
                arr[it] = nums[j];
                it++;
            }
            Arrays.sort(arr);
            int d = arr[1]-arr[0];
            for(int j = 1; j<arr.length; j++){
                if(arr[j]-arr[j-1]!=d){
                    sort = false;
                    break;
                }
            }
            if(sort){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}