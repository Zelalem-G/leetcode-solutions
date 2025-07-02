class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int z=0;z<nums.length;z++){
            int r = target - nums[z];
            
            if(map.containsKey(r)){
                if(map.get(r) != z){
                    ans[0]=z;
                    ans[1] = map.get(r);
                    return ans;
                }
            }

            map.put(nums[z],z);
        }

        return ans;

    }
}
