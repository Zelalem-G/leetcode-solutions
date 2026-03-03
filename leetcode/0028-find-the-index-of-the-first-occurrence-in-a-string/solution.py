class Solution(object):
    def strStr(self, haystack, needle):
        for i in range(len(haystack)-len(needle) +1):
            for j in range(len(needle)):
                if needle[j] != haystack[i+j]:
                    break
                if j == len(needle) -1:
                    return i
        return -1


        
