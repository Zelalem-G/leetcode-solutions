class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        
        Arrays.sort(b);
        int t1=0;
        int t2=0;

        for(int n: a){
            t1+=n;
        }
        for(int n: b){
            t2+=n;
        }

        for(int x: a){
            int y= (t2-t1)/2+x;
            int l=0,r=b.length-1;
            int c=-1;

            while(l<=r){
                int m=l+(r-l)/2;

                if(b[m]==y){
                    c=m;
                    break;
                } else if(b[m]<y){
                    l=m+1;
                } else {
                    r=m-1;
                }
            }

            if(c!=-1){
                return new int[]{x,b[c]};
            }

        }
            
        return new int[]{-1,-1};
        
    }
}
