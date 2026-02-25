class Solution(object):
    def matrixSum(self, nums):
        for row in nums:
            row.sort()

        total = 0
        m = len(nums)
        n = len(nums[0])

        for col in range(n):
            current_max = 0

            for row in range(m):
                current_max = max(current_max, nums[row][col])

            total += current_max

        return total
