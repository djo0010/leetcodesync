class Solution:
    def countKeyChanges(self, s: str) -> int:
        currKey = s[0].lower()
        count = 0
        for i in range(1, len(s)):
            if s[i].lower() != currKey:
                currKey = s[i].lower()
                count += 1

        return count
