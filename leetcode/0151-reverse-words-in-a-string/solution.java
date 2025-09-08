class Solution {
    public String reverseWords(String s) {
        ArrayList<String> words = new ArrayList<>();
        int l=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(l!=i){
                    words.add(s.substring(l,i));
                    l=i+1;
                } else {
                    l++;
                }
            } 

        }

        if(l<=s.length()-1){
            words.add(s.substring(l,s.length()));
        }

        StringBuilder ans = new StringBuilder();
        for(int i=words.size()-1;i>=0;i--){
            ans.append(words.get(i));
            if(i>0){
                ans.append(" ");
            } 
        }

        return ans.toString();

    }
}
