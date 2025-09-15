class Solution {
    public int maxArea(int[] h) {
        int maxArea=0;
        int l=0,r=h.length-1;

        while(l<r){
            int min = Math.min(h[l],h[r]);
            int tempArea = (r-l)*min;

            if(tempArea>maxArea){
                maxArea = tempArea;
            }

            if(h[l]<=h[r]){
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}
