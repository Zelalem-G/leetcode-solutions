class Solution(object):
    def findWinners(self, matches):
        loss = {}

        for w, l in matches:
            if w not in loss:
                loss[w] = 0
            loss[l] = loss.get(l, 0) + 1

        answer = [[], []]

        for player, cnt in loss.items():
            if cnt == 0:
                answer[0].append(player)
            elif cnt == 1:
                answer[1].append(player)

        return [sorted(answer[0]), sorted(answer[1])]

