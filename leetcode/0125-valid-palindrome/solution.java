class Solution {
    public boolean isPalindrome(String s) {
        String l = s.toLowerCase();
        char[] str = l.toCharArray();
        int i=0;
        int j=str.length-1;
        
        while(i<j){
            char c = str[i];
            if(!Character.isLetter(c) && !Character.isDigit(c)){
                i++;
                continue;
            }
            char z = str[j];
            if(!Character.isLetter(z) && !Character.isDigit(z)){
                j--;
                continue;
            }

            if(c != z){
                return false;
            }
            i++;
            j--;
        }

        return true;
        
    }
}
