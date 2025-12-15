class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==2){
            if(nums[0]==nums[1]) return 1;
            else return 2;
        }
        int l=0;

        for(int i=1;i<nums.length;i++){
            if(nums[l]!=nums[i]){
                nums[l+1]=nums[i];
                l++;
            }
        }

        return l+1;
    }
}
