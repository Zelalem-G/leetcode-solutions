class Solution(object):
    def getConcatenation(self, nums):
        n = len(nums)
        ans = [0]*(n*2)
        
        for i in range(n):
            ans[i] = nums[i]
            ans[n+i] = nums[i]

        return ans
