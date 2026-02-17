class Solution(object):
    def queryResults(self, limit, queries):
        ball = {}
        color = {}
        distinct = 0
        result = []

        for b, c in queries:
            if b in ball:
                old = ball[b]
                color[old] -= 1
                if color[old] == 0:
                    distinct -= 1

            ball[b] = c
            color[c] = color.get(c, 0) + 1
            if color[c] == 1:
                distinct += 1

            result.append(distinct)

        return result

