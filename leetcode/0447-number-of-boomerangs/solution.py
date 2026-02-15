class Solution(object):
    def numberOfBoomerangs(self, points):
        res = 0

        for i in range(len(points)):
            freq = {}

            for j in range(len(points)):
                if i == j:
                    continue

                dx = points[i][0] - points[j][0]
                dy = points[i][1] - points[j][1]
                d = dx*dx + dy*dy

                freq[d] = freq.get(d, 0) + 1

            for k in freq:
                res += freq[k] * (freq[k] - 1)

        return res

