class Solution(object):
    def missingNumber(self, nums):
        n = len(nums)
        total = (n*(n+1))//2
        sum =0
        for num in nums:
            sum += num

        return total - sum    
