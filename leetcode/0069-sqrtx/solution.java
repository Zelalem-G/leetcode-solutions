class Solution {
    public int mySqrt(int x) {
        int l=0,r=x;
        int m=0;

        if(x==1) return 1;
        if(x==0) return 0;

        while(l<=r){
            m= l+(r-l)/2;

            if(m == x / m){
                return m;
            } else if(m > x / m){
                r=m-1;
            } else if(m < x / m){
                l=m+1;
            }
        }

        return l-1;
        
    }
}
