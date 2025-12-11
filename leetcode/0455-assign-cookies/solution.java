class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int ans=0;
        int a=0;

        for(int j=0;j<s.length;j++){
            if(a>=g.length){
                break;
            }
            if(s[j]>=g[a]){
                ans++;
                a++;
            } 
        }

        return ans;
    }
}
