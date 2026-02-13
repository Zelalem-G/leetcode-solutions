class Solution(object):
    def findDiagonalOrder(self, mat):
        mp = {}
        n = len(mat)
        m = len(mat[0])

        for i in range(n):
            for j in range(m):
                if i+j not in mp:
                    mp[i+j] = []
                mp[i+j].append(mat[i][j])
        
        ans = []
        direction = False
        for key in sorted(mp):
            if direction:
                for val in mp[key]:
                    ans.append(val)
                direction = not direction
            else:
                for i in range(len(mp[key])-1,-1,-1):
                    ans.append(mp[key][i])
                direction = not direction

        return ans

