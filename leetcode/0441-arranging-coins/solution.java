class Solution {
    public int arrangeCoins(int n) {
        int l=0,r=n;

        while (l<=r) {
            int m =l+(r-l)/2;

            long c =(long) m*(m+1)/2;
            if (c == n) return (int)m;
            if (c < n) l = m + 1;
            else r = m - 1;
        }
        return (int)r; 
    }
}

