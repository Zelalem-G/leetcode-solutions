class Solution(object):
    def maxCoins(self, piles):
        piles.sort(reverse=True)
        print(piles)
        ans = 0
        my= 1
        bob = len(piles)-1

        #for i in range(1,len(piles),3)
        while my<bob:
            ans += piles[my]
            print(piles[my])
            my += 2
            bob -=1
        return ans
