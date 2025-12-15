class Solution {
    public boolean isPalindrome(String s) {
        String ls = s.toLowerCase();
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (!Character.isLetterOrDigit(ls.charAt(l))) {
                l++;
            } else if (!Character.isLetterOrDigit(ls.charAt(r))) {
                r--;
            } else if (ls.charAt(l) != ls.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }

        return true;
    }
}

