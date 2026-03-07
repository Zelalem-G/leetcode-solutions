class Solution(object):
    def romanToInt(self, s):
        symbol = {"I":1, "V":5, "X":10, "L":50, "C":100, "D":500, "M":1000}
        numbers = [0]*len(s)
        ans = 0

        for i in range(len(s)):
            numbers[i] = symbol[s[i]]
        
        i=0
        while i < (len(numbers)-1):
            if numbers[i+1]>numbers[i]:
                ans += numbers[i+1]-numbers[i]
                i += 2
            else:
                ans += numbers[i]
                i += 1
        
        if i < len(numbers):
            ans += numbers[len(numbers)-1]
        return ans

