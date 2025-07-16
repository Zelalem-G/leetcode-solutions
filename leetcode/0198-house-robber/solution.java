class Solution {
    public int rob(int[] nums) {
        int prev1=0;
        int prev2=0;
        int cur=0;
        if(nums.length ==0){
            return 0;
        }
        if(nums.length ==1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        for(int i=0;i<nums.length;i++){
            cur = Math.max(prev1,nums[i]+prev2);
            prev2=prev1;
            prev1=cur;
        }

        return prev1;   
    }
}
