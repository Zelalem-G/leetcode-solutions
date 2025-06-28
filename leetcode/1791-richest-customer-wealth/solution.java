class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = accounts[0][0];
        for(int[] person : accounts){
            int sum =0;
            for(int acc : person){
                sum += acc;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
