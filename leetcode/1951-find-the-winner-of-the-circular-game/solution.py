class Solution(object):
    def findTheWinner(self, n, k):
        players = list(range(1, n + 1))
        idx = 0

        while len(players) > 1:
            idx = (idx + k - 1) % len(players)
            players.pop(idx)

        return players[0]

