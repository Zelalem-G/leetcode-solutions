class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int j=0;j<nums1.length;j++){
            int n = nums1[j];
            int max = -1;
            for(int i=0;i<nums2.length;i++){
                if(nums2[i]==n){
                    max=n;
                }
                if(max==n && nums2[i]>max){
                    max=nums2[i];
                    break;
                }
            }
            if(max == n){
               ans[j] = -1; 
            } else {
                ans[j] = max;
            }
        }

        return ans;
    }
}
