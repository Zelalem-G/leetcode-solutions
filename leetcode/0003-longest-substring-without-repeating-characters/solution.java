class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;

        int longest = 0;
        int temp=1;
        int i=0, j=1,c=0;
        while(j<s.length()){
             c= i;
            while(c<j){
                if(s.charAt(c) == s.charAt(j)){
                    i=c+1;
                    break;
                }
                temp++;
                c++;
            }

            longest = Math.max(longest, temp);
            temp=1;
            j++;
        }

        return longest;
    }
}
