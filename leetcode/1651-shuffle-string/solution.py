class Solution(object):
    def restoreString(self, s, indices):
        ans = [0]*len(indices)

        for i in range(len(s)):
            ans[indices[i]] = s[i]
        return "".join(ans) 
