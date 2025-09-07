class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int[] ans = new int[nums.length];
        for(int n: nums){
            if(n!=0){
                ans[i++] = n;
            } 
        }

        for(int j=0;j<nums.length;j++){
            if(j<i){
                nums[j]=ans[j];
            } else{
                nums[j]=0;
            }
        }
    }
}
