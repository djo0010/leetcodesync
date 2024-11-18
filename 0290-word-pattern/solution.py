class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        strings = s.split()
        mappings = {}

        i = 0
        if len(strings) != len(pattern):
            return False
        for char in pattern:
            if char not in mappings:
                if strings[i] in mappings.values():
                    return False
                mappings[char] = strings[i] 
            elif char in mappings:
                if mappings.get(char) != strings[i]:
                    return False
            i += 1
        return True        

