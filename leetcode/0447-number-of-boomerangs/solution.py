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

                count = freq.get(d, 0)
                res += 2 * count
                freq[d] = count + 1

        return res

