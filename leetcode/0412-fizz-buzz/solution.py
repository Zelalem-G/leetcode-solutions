class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        ans = [0]* n
        for i in range(1,n+1):
            cur = ""
            if i % 3 == 0:
                cur = "Fizz"
            if i % 5 == 0:
                cur += "Buzz"
            if not cur:
                cur = str(i) 

            ans[i-1] = cur
            
        return ans
