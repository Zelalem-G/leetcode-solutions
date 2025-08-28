class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        int l = 2, r = num / 2;
        while (l <= r) {
            int m = l + (r - l) / 2;
            long g = (long) m * m; 
            if (g == num) {
                return true;
            } else if (g > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}
