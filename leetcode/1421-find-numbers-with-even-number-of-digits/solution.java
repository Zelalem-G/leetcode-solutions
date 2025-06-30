class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int d=0;
            if(num == 0){
                d=1;
            }
            while(num > 0){
                d++;
                num /= 10;
            }
            if(d % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
