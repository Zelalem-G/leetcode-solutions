class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length<3) return false;

        int f = Integer.MAX_VALUE;   
        int s = Integer.MAX_VALUE;  

        for (int z=0;z<nums.length;z++) {
            if (nums[z]<=f) {
                f=nums[z]; 
            } else if (nums[z]<=s) {
                s=nums[z];  
            } else {
                return true;     
            }
        }

        return false;
    }
}

