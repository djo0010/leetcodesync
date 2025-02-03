class Solution:
    def findValidPair(self, s: str) -> str:

        mappings = defaultdict(int)

        for i in range(len(s)):
            mappings[s[i]] += 1
    
    
        for i in range(len(s)):
            if i + 1 < len(s) and s[i] != s[i + 1] and mappings[s[i]] == int(s[i]) and mappings[s[i + 1]] == int(s[i + 1]):
                res = s[i] + s[i + 1]
                return res
        return ""
