class Solution(object):
    def flipAndInvertImage(self, image):
        ans = []
        n = len(image)

        for i in range(n):
            row = []
            for j in range(n-1,-1,-1):
                row.append(1-image[i][j])
            ans.append(row)
        
        return ans
        
