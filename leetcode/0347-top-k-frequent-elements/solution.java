class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer>[] count = new ArrayList[nums.length+1]; 

        int[] ans = new int[k];

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        map.forEach((key, value) -> {
            if (count[value] == null) {
                count[value] = new ArrayList<>();
            }
            count[value].add(key);
        });

        for(int i=count.length-1;i>0;i--){
            
            if(count[i] == null) continue;

            for (int num : count[i]) {  
                ans[--k] = num;
                if(k==0) break;     
            }
            if(k==0) break;     

        }

        return ans;
    }
}
