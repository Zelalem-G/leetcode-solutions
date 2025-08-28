/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=0,r=n;
        int m=0;
        boolean result;

        while(l<r){
            m=l+(r-l)/2;
            result=isBadVersion(m);

            if(result){
                r=m;
            }else {
                l=m+1;
            }
        }

        return r;
    }
}
