class Solution:
    def compress(self, chars: List[str]) -> int:
        if not chars:
            return 0  # Edge case for empty input
            
        charsArrayIndex = 0
        i = 0
        
        while i < len(chars):
            count = 1
            startChar = chars[i]
            
            # Count consecutive occurrences
            while i + 1 < len(chars) and chars[i] == chars[i + 1]:
                count += 1
                i += 1
            
            chars[charsArrayIndex] = startChar
            charsArrayIndex += 1
            
            # If count > 1, add the count as individual digits
            if count > 1:
                for char in str(count):  # Direct iteration over string
                    chars[charsArrayIndex] = char
                    charsArrayIndex += 1
            
            i += 1
        
        # Modify the original list in place
        chars[:] = chars[:charsArrayIndex]
        
        return len(chars)
