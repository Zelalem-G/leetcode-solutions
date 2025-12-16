class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
                return nums[0];
            }
            int max=0;
            int count=1;
            int maxElement=0;
            Arrays.sort(nums);
            
            int l=0;
            for(int i=1;i<nums.length;i++){
                if(nums[l]!=nums[i]){
                    l=i;
                    count=1;
                } else{
                    count++;
                }
                if(count>max){
                    max=count;
                    maxElement = nums[i];
                }
            }
            
            return maxElement;
    }
}
