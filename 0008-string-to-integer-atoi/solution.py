class Solution:
    def myAtoi(self, s: str) -> int:
        i = 0
        negative = False
        if len(s) == 0:
            return 0
        while i < len(s) and s[i] == " ":
            i += 1
        if i < len(s) and s[i] == "-":
            negative = True
            i+=1
        elif i < len(s) and s[i] == "+":
            i += 1
        while  i < len(s) and s[i] == "0":
            i += 1

        firstMarker = 2147483647
        secondMarker = -2147483648
        res = 0
        numIndex = 0
        while i < len(s):
            if s[i].isdigit():
                firstMarker = min(firstMarker, i)
                secondMarker = max(secondMarker, i)
            else:
                break
            if s[i].isdigit():
                res += float(s[i]) * 10**numIndex
                numIndex -= 1
                i += 1
            else:
                break
        res = int(round(res * 10**(secondMarker - firstMarker) * -1)) if negative else int(round(res * 10**(secondMarker - firstMarker)))
        if res < -2147483648:
            return -2147483648
        elif res > 2147483647:
            return 2147483647
        else:
            return res
            
        

