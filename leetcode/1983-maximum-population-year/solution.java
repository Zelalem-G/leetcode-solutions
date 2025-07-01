class Solution {
    public int maximumPopulation(int[][] logs) {
        int min = 0;
        int[] change = new int[101];

        for(int[] log : logs){
            change[log[0]-1950] += 1; 
            change[log[1]-1950] -= 1; 
        }

        for(int i=1;i<change.length;i++){
            change[i] += change[i-1]; 
        }

        int c=0;
        for(int i=0;i<change.length;i++){
            if(change[i]>c){
                c=change[i];
                min = 1950 + i;
            }
        }
 
        return min;
    }
}
