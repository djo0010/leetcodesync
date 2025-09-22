class Solution:
    def isPalindrome(self, s: str) -> bool:
        array = []
        for char in s:
            if char.isalnum():
                array.append(char)
            

        def validPalindrome(s: str) -> bool:
            l = 0
            r = len(s) - 1
            while l <= r:  
                if s[l].lower() != s[r].lower():
                    return False
                l += 1
                r -= 1
            return True
        
        print("".join(array))
        return validPalindrome("".join(array))
        
        
            

    
