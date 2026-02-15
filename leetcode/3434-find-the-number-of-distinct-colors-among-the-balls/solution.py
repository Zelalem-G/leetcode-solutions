class Solution(object):
    def queryResults(self, limit, queries):
        ballColor = {}
        colorCount = {}
        ans = []
        distinct = 0

        for ball, color in queries:
            if ball in ballColor:
                old = ballColor[ball]
                colorCount[old] -= 1
                if colorCount[old] == 0:
                    distinct -= 1

            ballColor[ball] = color

            if color not in colorCount or colorCount[color] == 0:
                distinct += 1

            colorCount[color] = colorCount.get(color, 0) + 1

            ans.append(distinct)

        return ans

