class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        res = list(s)
        stack = []

        for i in range(len(s)):
            if s[i] == "(":
                stack.append(i)
            elif s[i] == ")" and stack:
                stack.pop()
            elif s[i] == ")":
                res[i] = ''
        
        while stack:
            res[stack.pop()] = ''

        return "".join(res)
