class Solution(object):
    def maxScoreIndices(self, nums):
        left = []
        right = nums
        zero = 0
        one = 0
        score = []
        ind = []
        largest = 0

        right.reverse()
        one = right.count(1)
        score.append(zero + one)
        largest = zero + one

        for i in range(len(right)):
            first = right.pop()
            left.append(first)
            
            if first == 0:
                zero += 1
            else:
                one -= 1

            score.append(zero + one)
            largest = max(largest, (zero + one))
        
        #largest = max(score)
        print(largest)

        for i in range(0, len(score)):
            if score[i] == largest:
                ind.append(i)
        
        return ind
