class Solution {
    public String gcdOfStrings(String s1, String s2) {
        if(!(s1+s2).equals(s2+s1)) return "";
        int ans=0;

        for(int i = Math.max(s1.length(),s2.length());i>0;i--){
            if(s1.length()%i==0 && s2.length()%i==0){
                ans=i;
                break;
            }
        }

        return s1.substring(0,ans);
        
    }
}
