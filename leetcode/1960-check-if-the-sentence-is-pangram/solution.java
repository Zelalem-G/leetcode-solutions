class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] count = new boolean[123];
        char[] sent = sentence.toCharArray();

        for(int i=97;i<123;i++){
             count[i] = false;
        }

        for(int i=0;i<sent.length;i++){
            int j = (int) sent[i];

            if(!count[j]){
                    count[j]= true;
            }
        }
        for(int i=97;i<123;i++){
            if(!count[i]){
                return false;
            }
        }
        return true;
    }
}
