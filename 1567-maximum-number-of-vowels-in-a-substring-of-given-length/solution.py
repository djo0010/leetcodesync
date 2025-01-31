class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = ["a", "e", "i", "o", "u"]
        currVowelCount = 0
        for i in range(k):
            if s[i] in vowels:
                currVowelCount += 1
        maxVowelCount = currVowelCount
        for i in range(1, len(s) - k + 1):
            if s[i - 1] in vowels:
                currVowelCount -= 1
            if s[i + k - 1] in vowels:
                currVowelCount += 1
            maxVowelCount = max(currVowelCount, maxVowelCount)
        return maxVowelCount
