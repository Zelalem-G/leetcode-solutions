class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int rs=0,re=matrix.length-1;
        int cs=0,ce=matrix[0].length-1;
        int i=0;
        
        while(rs <= re && cs <= ce){
            if (rs <= re){
                for(int j=cs;j<=ce;j++){
                    ans.add(matrix[rs][j]);
                }
                rs++;
            }

            if (cs <= ce){
                for(int j=rs;j<=re;j++){
                    ans.add(matrix[j][ce]);
                }
                ce--;
            }

            if (rs <= re){
                for(int j=ce;j>=cs;j--){
                    ans.add(matrix[re][j]);
                }
                re--;
            }

            if (cs <= ce){
                for(int j=re;j>=rs;j--){
                    ans.add(matrix[j][cs]);
                }
                cs++;
            }

        }

        return ans;
    }
}
