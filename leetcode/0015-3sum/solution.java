class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int x = 0; x < nums.length - 2; x++) {
            if (x > 0 && nums[x] == nums[x - 1]) continue;

            int target = -nums[x];
            int i = x + 1, j = nums.length - 1;

            while (i < j) {
                int c = nums[i] + nums[j];
                if (c > target) {
                    j--;
                } else if (c < target) {
                    i++;
                } else {
                    ans.add(List.of(nums[x], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[i + 1]) i++;
                    while (i < j && nums[j] == nums[j - 1]) j--;
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}

