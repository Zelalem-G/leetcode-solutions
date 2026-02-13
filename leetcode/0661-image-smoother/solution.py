class Solution(object):
    def imageSmoother(self, img):
        ans = []
        n = len(img)
        m = len(img[0])


        for i in range(n):
            col = []
           
            for j in range(m):
                c=1
                total = 0
                total += img[i][j]
                if i+1 < n:
                    total += img[i+1][j]
                    c += 1
                if j+1 < m:
                    total += img[i][j+1]
                    c += 1
                if j+1<m and i+1<n:
                    total += img[i+1][j+1]
                    c += 1

                if i-1 > -1:
                    total += img[i-1][j]
                    c += 1
                if i-1 > -1 and j+1<m:
                    total += img[i-1][j+1]
                    c += 1
                if j-1 > -1:
                    total += img[i][j-1]
                    c += 1
                if j-1 > -1 and i+1<n:
                    total += img[i+1][j-1]
                    c += 1
                if j-1>-1 and i-1>-1:
                    total += img[i-1][j-1]
                    c += 1
                col.append(total//c)
            ans.append(col)

        return ans
