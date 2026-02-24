class Solution(object):
    def sortPeople(self, names, heights):
        n = len(heights)

        for i in range(n):
            for j in range(0, n - i):
                if heights[j] < heights[n-1-i]:  
                    heights[j], heights[n-1-i] = heights[n-1-i], heights[j]
                    names[j], names[n-1-i] = names[n-1-i], names[j]

        return names
