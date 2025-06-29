class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            int j = row.length-1;
            for(int i=0;i<=j;i++){
                if(i<j){
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;

                    if(row[j] == 1){
                        row[j] = 0;
                    } else {
                        row[j] = 1;
                    }
                }

                if(row[i] == 1){
                    row[i] = 0;
                } else{
                    row[i] = 1;
                }
                j--;
            }
        }
        return image;
    }
}
