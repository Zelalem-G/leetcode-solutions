class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""

        ans = strs[0]

        for word in strs[1:]:
            while not word.startswith(ans):
                ans = ans[:-1]
                if ans == "":
                    return ""

        return ans   
