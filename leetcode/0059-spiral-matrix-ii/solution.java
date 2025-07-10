class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int num=1;
        int rs=0,re=n-1;
        int cs=0,ce=n-1;

        while(rs <= re && cs <= ce){
            for(int i=cs;i<=ce;i++){
                ans[rs][i] = num++;
            }
            rs++;

            for(int i=rs;i<=re;i++){
                ans[i][ce] = num++;
            }
            ce--;

            if(rs <= re){
                for(int i=ce;i>=cs;i--){
                    ans[re][i] = num++;
                }
                re--;
            }

            if(cs <= ce){
                for(int i=re;i>=rs;i--){
                    ans[i][cs] = num++;
                }
                cs++;
            }
        }

        return ans;
        
    }
}
