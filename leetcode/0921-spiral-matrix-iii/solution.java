class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows*cols][2];
        int x=rStart;
        int y=cStart;
        int step=1;
        int dir=0;
        int index=0;
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        ans[index++]= new int[]{x,y};

        while(index<rows*cols){
            for(int d=0;d<2;d++){
                for(int i=0;i<step;i++){
                    x += direction[dir][0];
                    y += direction[dir][1];

                    if (x >= 0 && x < rows && y >= 0 && y < cols) {
                        ans[index++] = new int[]{x, y};
                    }
                }
                dir = (dir + 1) %4;
            }
            step++;
        }

        return ans;
    }
}
