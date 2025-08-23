class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int m=0;
        int l=0,r=arr.length-1;

        while(l<r){
            m=l+(r-l)/2;

            if(arr[m]<arr[m+1]){
               l=m+1;
            } else {
                r=m;
            }
        }

        return l;
    }
}
