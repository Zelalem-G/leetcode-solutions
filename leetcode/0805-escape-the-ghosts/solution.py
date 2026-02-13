class Solution(object):
    def escapeGhosts(self, ghosts, target):
        ghostMin = float("inf")

        pacDistance = abs(target[0]) + abs(target[1])

        for ghost in ghosts:
            x = abs(ghost[0] - target[0])
            y = abs(ghost[1] - target[1])
            d = x + y
            ghostMin = min(ghostMin, d)

        return pacDistance < ghostMin

