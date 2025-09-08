class Solution {
    public String reverseVowels(String s) {
        String v = "aeiouAEIOU"; 
        int r=s.length()-1;
        int l=0;
        char[] arr = s.toCharArray();

        while(l<r){
            if (v.indexOf(arr[l]) == -1){
                l++;
            }else if(v.indexOf(arr[r]) == -1){
                r--;
            } else {
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
            }
        }

        return new String(arr);
    }
}

