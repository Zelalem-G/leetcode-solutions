class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        int c=0;
        for(int n:heights){
            expected[c++] = n;
        }
        Arrays.sort(heights);

        int ans=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                ans++;
            }
        }
        return ans;
    }
}
