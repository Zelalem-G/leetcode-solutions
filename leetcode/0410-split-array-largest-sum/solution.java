class Solution {
    public int splitArray(int[] nums, int k) {

        int m=0;
        int l=0,r=0;

        for(int i=0;i<nums.length;i++){
            r += nums[i];
            l=Math.max(l,nums[i]);
        }


        while(l<r){
            m = l+(r-l)/2;
            int p=1;

            int max=0;
            for(int i=0;i<nums.length;i++){
                if(max + nums[i]>m){
                    p++;
                    max=0;
                }
                
                max +=nums[i];
            }

            if(p>k){
                l=m+1;
            } else {
                r = m;
            }

        }        

         return l;      
    } 
}
