class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for(int i=0; i<target.length;i++){
            int n=index[i];
            if(i<=n){
                    target[n] = nums[i];
                    continue;
                }
            for(int j=i-1;i>=0;j--){
                target[j+1]=target[j];
                if(j==n){
                    target[n] = nums[i];
                    break;
                }
            }
            
        }

        return target;   
    }
}
