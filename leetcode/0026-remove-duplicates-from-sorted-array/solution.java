class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uni=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i] > nums[uni]){
                uni++;
                nums[uni] = nums[i];
            }
        }
        
        return uni+1;
    }
}
