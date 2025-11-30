class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(); // Used to build the resulting string

        // Iterate through each character of the input string
        for (char c : s.toCharArray()) {
            // If the character is a digit
            if (Character.isDigit(c)) {
                // If the StringBuilder is not empty, remove the last character
                // This simulates removing the closest non-digit to the left
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            } else {
                // If the character is not a digit, append it to the StringBuilder
                sb.append(c);
            }
        }

        // Return the final string built by the StringBuilder
        return sb.toString();
    }
}
