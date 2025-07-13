class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        int start = 0;
        int mid = 0;
        int end = nums.length-1;
        int top=-1;
        int bottom = -1;

        if(nums.length == 0){
            return ans;
        }

        while(start <= end){
            mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans[0] = mid;
                if(top == -1) {
                    top = end;
                }
                if(bottom == -1) {
                    bottom = start;
                }
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        if(bottom == -1 && top == -1){
            return ans;
        } 

        while(bottom <= top){
            mid = bottom + (top - bottom)/2;

            if(nums[mid] == target){
                ans[1] = mid;
                bottom = mid+1;
            }else if(nums[mid] < target){
                bottom = mid+1;
            } else {
                top = mid-1;
            }
        }


        return ans;
    }
}
