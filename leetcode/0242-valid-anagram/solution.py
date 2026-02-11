class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False

        mpS = {}
        mpT = {}

        for c in s:
            mpS[c] = mpS.get(c,0)+1
        for c in t:
            mpT[c] = mpT.get(c,0)+1

        for k in mpS:
             if mpT.get(k, 0) != mpS[k]:
                return False
        return True
