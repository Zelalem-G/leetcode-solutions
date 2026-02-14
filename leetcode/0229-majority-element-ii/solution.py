class Solution(object):
    def majorityElement(self, nums):
        cand1 = cand2 = None
        count1 = count2 = 0

        for x in nums:
            if x == cand1:
                count1 += 1
            elif x == cand2:
                count2 += 1
            elif count1 == 0:
                cand1 = x
                count1 = 1
            elif count2 == 0:
                cand2 = x
                count2 = 1
            else:
                count1 -= 1
                count2 -= 1

        res = []
        n = len(nums)

        if nums.count(cand1) > n // 3:
            res.append(cand1)
        if cand2 != cand1 and nums.count(cand2) > n // 3:
            res.append(cand2)

        return res

        
