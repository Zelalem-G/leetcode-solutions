class Solution:
    def isCovered(self, ranges, left, right):
        ranges.sort()
        curr = left

        for l, r in ranges:
            if r < curr:
                continue

            if l > curr:
                return False

            curr = r + 1

            if curr > right:
                return True

        return curr > right

