class Solution(object):
    def sortColors(self, nums):
        count = [0]*3
        for n in nums:
            count[n] += 1
        b = 0    
        for i in range(3):
            while(count[i]>0):
                nums[b] = i
                b +=1
                count[i] -=1 
        
