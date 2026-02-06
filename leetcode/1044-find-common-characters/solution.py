from collections import Counter

class Solution:
    def commonChars(self, words):
        common = Counter(words[0])
        
        for word in words[1:]:
            count = Counter(word)
            for char in list(common.keys()):
                if char in count:
                    common[char] = min(common[char], count[char])
                else:
                    del common[char]
        
        result = []
        for char, freq in common.items():
            result.extend([char] * freq)
        
        return result

