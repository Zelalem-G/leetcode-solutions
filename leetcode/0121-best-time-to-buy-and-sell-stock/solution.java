class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int a=0;
        int b=1;
        int d=0;

        while(b<prices.length){
            if(prices[a] >= prices[b]){
                a=b;
                b++;
                continue;
            }
            if(prices[a] < prices[b]){
                d = Math.max(d,prices[b]-prices[a]);
                b++;
            }
        }
        return d;
    }
}
