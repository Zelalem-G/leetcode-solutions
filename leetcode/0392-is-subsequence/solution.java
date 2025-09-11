class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return t.length()>=0;
        if(t.length()==0) return s.length()==0;

        int l=0;

        for(int i=0;i<t.length();i++){
            if(s.charAt(l)==t.charAt(i)){
                l++;
            }
            if(l==s.length()){
                return true;
            }
        }

        return false;
    }
}
