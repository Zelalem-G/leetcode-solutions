class Solution(object):
    def findRestaurant(self, list1, list2):
        best = 2000
        ans = []
        mp = {}
        
        for i in range(len(list2)):
            mp[list2[i]] = i

        for i in range(len(list1)):
            if list1[i] in mp:
                cur = i+mp[list1[i]]
                if cur < best:
                    ans = []
                    ans.append(list1[i])
                    best = cur
                elif cur == best:
                    ans.append(list1[i])
        return ans
