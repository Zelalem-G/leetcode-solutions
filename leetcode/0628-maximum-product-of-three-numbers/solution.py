class Solution(object):
    def maximumProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()

        prod1 = nums[0] * nums[1] * nums[-1]
        prod2 = nums[-1] * nums[-2] * nums[-3]

        return max(prod1, prod2)
