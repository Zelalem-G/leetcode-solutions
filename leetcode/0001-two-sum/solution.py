class Solution:
    def twoSum(self, nums, target):
        ans = [0, 0]
        mp = {}

        for z in range(len(nums)):
            r = target - nums[z]

            if r in mp:
                ans[0] = z
                ans[1] = mp[r]
                return ans

            mp[nums[z]] = z

        return ans

