class Solution(object):
    def merge(self, nums1, m, nums2, n):
        c=0
        for i in range(m,len(nums1)):
            v = nums2[c]
            c += 1
            j= i-1

            while j>=0 and nums1[j] > v:
                nums1[j+1] = nums1[j]
                j -= 1
            nums1[j+1] = v

        
