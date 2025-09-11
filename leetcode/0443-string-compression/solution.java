class Solution {
    public int compress(char[] chars) {
        char temp = '\0';   
        int result = -1;    
        int count = 0;     

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != temp) {
                if (count > 1) {
                    String cntStr = Integer.toString(count);
                    for (int k = 0; k < cntStr.length(); k++) {
                        chars[++result] = cntStr.charAt(k);
                    }
                }
                temp = chars[i];
                chars[++result] = temp;
                count = 1;
            } else {
                count++;
            }
        }

        if (count > 1) {
            String cntStr = Integer.toString(count);
            for (int k = 0; k < cntStr.length(); k++) {
                chars[++result] = cntStr.charAt(k);
            }
        }

        return result+1;
    }
}

