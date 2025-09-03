class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int l=0,r=nums.length;

        while(l<=r){
            int m=l+(r-l)/2;

            int count=0;
            for(int v: nums){
                if(v>=m) count++;
            }

            if(count == m){
                return m;
            } else if(count > m){
                l=m+1;
            } else{
                r=m-1;
            }
        }

        return -1;
        
    }
}
