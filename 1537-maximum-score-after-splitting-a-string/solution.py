class Solution:
    def maxScore(self, s: str) -> int:
        leftZeros = 1 if s[0] == "0" else 0
        rightOnes = 0
        for i in range(1, len(s)):
            if s[i] == "1":
                rightOnes += 1
        
        currScore = leftZeros + rightOnes
        for i in range(1, len(s) - 1):
            if s[i] == "1":
                rightOnes -= 1
            else:
                leftZeros += 1
            currScore = max(currScore, leftZeros + rightOnes)

        return currScore
