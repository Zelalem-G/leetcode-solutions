class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        boolean even = true;
        int j=0;
        for(int i=0;i < ans.length;i++){
            if(even){
                ans[i] = nums[j];
                even = !even;
                j++;
            } else {
                ans[i] = nums[n];
                even = !even;
                n++;
            }
        }
        return ans;
    }
}
