class Solution:
    def customSortString(self, order: str, s: str) -> str:
        res = []
        s_chars = list(s)
        for char in order:
            if char in s_chars:
                res.append(char)
                s_chars.remove(char)
        
        for s_char in s_chars:
            if s_char in res:
                index = res.index(s_char);
                res.insert(index, s_char)
            else:
                res.append(s_char)
        print(res)        
        
        return "".join(res)
