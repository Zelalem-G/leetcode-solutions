/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int ans=-1;
        int m=0;
        int l=0,r=mountainArr.length()-1;

        while(l<r){
            m=l+(r-l)/2;

            if(mountainArr.get(m)<mountainArr.get(m+1)){
               l=m+1;
            } else {
                r=m;
            }
        }

        int p = l;
        // System.out.println(p);

        l=0;
        r=p;

        while(l<=r){
            m=l+(r-l)/2;

            if(mountainArr.get(m)<target){
                l=m+1;
            } else if(mountainArr.get(m)>target){
                r=m-1;
            } else{
                ans=m;
                r=m-1;
            }
        }

        if(ans != -1) {
            return ans;
        }

        l=p+1;
        r=mountainArr.length()-1;

        while(l<=r){
            m=l+(r-l)/2;

            if(mountainArr.get(m)<target){
                r=m-1;
            } else if(mountainArr.get(m)>target){
                l=m+1;
            } else{
                ans=m;
                r=m-1;
            }
        }
        
        return ans;
    }
    }

