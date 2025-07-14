class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        int n = nums.length;
        int start =0;
        int end = n-1;
        int temp =0;
        
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        start=0;
        end = k-1;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        start=k;
        end=n-1;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
    }
}
