class Solution:
    def addSpaces(self, s: str, spaces: List[int]) -> str:
        res = ""
        indexInSpaces =  0
        for i in range(len(s)):
            if indexInSpaces >= len(spaces) or i != spaces[indexInSpaces]:
                res += s[i]
            else:
                res += " "
                res += s[i]
                indexInSpaces += 1
        return res
                

        
