class Solution {
    public int removeElement(int[] nums, int val) {
        
        int end=nums.length-1;
        for(int i=0; i<=end; i++){
            while(end >=i && nums[end]==val) {
                end--;
            }
            if (end < i) break;

            if(nums[i]==val){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        
        return end+1;
    }
}
