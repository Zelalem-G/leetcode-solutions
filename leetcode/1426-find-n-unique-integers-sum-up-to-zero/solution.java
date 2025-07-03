class Solution {
    public int[] sumZero(int n) {
        if(n==1){
            return new int[]{0};
        }

        int s = n-1;
        if(n%2 != 0){
            int[] nums  = new int[n];
            nums[n-1]=0;
            int j=0;
            for(int i=0;i<n/2;i++){
        
                int x = s;
                nums[j++] = x;

                s = s * -1;
                nums[j++] = s;
                
                s = s * -1;
                s--;
            }

            return nums;

        } else{
            int[] num  = new int[n];
            int j=0;
            for(int i=0;i<n/2;i++){
        
                int x = s;
                num[j++] = x;

                s = s * -1;
                num[j++] = s;
                
                s = s * -1;
                s--;
            }

            return num;
        }

    }
}
