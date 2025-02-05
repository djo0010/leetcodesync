class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        if s1 == s2:
            return True
        countIncorrect = 0
        s1Chars = []
        s2Chars = []
        for i in range(len(s1)):
            if s2[i] != s1[i]:
                s1Chars.append(s1[i])
                s2Chars.append(s2[i])
                countIncorrect += 1
            if countIncorrect == 3:
                return False
        return countIncorrect == 2 and s1Chars[0] == s2Chars[1] and s1Chars[1] == s2Chars[0]
