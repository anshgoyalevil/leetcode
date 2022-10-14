class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        
        if(nums1.length%2!=0 && nums2.length%2==0){
            long xor = 0;
            for(int i = 0; i<nums2.length; i++){
                xor = xor^nums2[i];
            }
            return (int)xor;
        }
        else if(nums1.length%2==0 && nums2.length%2!=0){
            long xor = 0;
            for(int i = 0; i<nums1.length; i++){
                xor = xor^nums1[i];
            }
            return (int)xor;
        }
        else if(nums1.length%2==0 && nums2.length%2==0){
            return 0;
        }
        else{
            long xor1 = 0;
            for(int i = 0; i<nums1.length; i++){
                xor1 = xor1^nums1[i];
            }
            long xor2 = 0;
            for(int i = 0; i<nums2.length; i++){
                xor2 = xor2^nums2[i];
            }
            return (int)(xor1^xor2);
        }
        
    }
}