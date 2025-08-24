class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        int p = nums.length - 1;  
        
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (m < r && nums[m] > nums[m + 1]) {
                p = m;             
                break;
            } else if (m > l && nums[m] < nums[m - 1]) {
                p = m - 1;         
                break;
            } else if (nums[m] >= nums[l]) {
                l = m + 1;         
            } else {
                r = m - 1;         
            }
        }

        if (target >= nums[0]) {    
            l = 0;
            r = p;
        } else {                    
            l = p + 1;
            r = nums.length - 1;
        }

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) return m;
            if (nums[m] < target)  l = m + 1;
            else                   r = m - 1;
        }
        return -1;
    }
}

