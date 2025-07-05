class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m= mat.length;
        int n= mat[0].length;
        int[] row = new int[n*m];
        int[][] ans = new int[r][c];

        if(n*m > r*c || n*m < r*c){
            return mat;
        }

        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
            row[n*i+j] = mat[i][j];
          }
        }

        for (int i = 0; i < r * c; i++) {
            ans[i / c][i % c] = row[i];
        }

        return ans;
    }
}
