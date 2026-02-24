class Solution(object):
    def spiralOrder(self, matrix):
        m = len(matrix)
        n = len(matrix[0])

        ans = []

        lc,rc,tr,br = 0,n-1,0,m-1

        while lc <= rc:
            for i in range(lc,rc+1):
                ans.append(matrix[tr][i])
            tr += 1
            print(ans)

            if tr>br:
                break
            for i in range(tr,br+1):
                ans.append(matrix[i][rc])
            rc -= 1

            if lc>rc:
                break
            for i in range(rc, lc-1, -1):
                ans.append(matrix[br][i])
            br -= 1

            if tr>br:
                break
            for i in range(br, tr-1, -1):
                ans.append(matrix[i][lc])
            lc += 1

        return ans
        
