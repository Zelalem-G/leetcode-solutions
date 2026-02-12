class Solution(object):
    def uniqueMorseRepresentations(self, words):
        morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        ans = set()

        for w in words:
            tr = ""
            for c in w:
                i = ord(c)-ord("a")
                tr += morse[i]
            ans.add(tr)

        return len(ans)
