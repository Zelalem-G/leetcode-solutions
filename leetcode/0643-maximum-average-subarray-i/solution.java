class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int temp=0;
        int sum =0;

        for(int i=0;i<k;i++){
            sum +=nums[i];
        }
        temp = sum;

        for(int i=k;i<nums.length;i++){
           temp -= nums[l];
           temp += nums[i];
            sum = Math.max(sum,temp);
            l++;
        }

        double ans =(double) sum/k;
        return ans;

    }
}
