class Solution:
    def removeOccurrences(self, s: str, part: str) -> str:
        
        containsOccurence = True
        current_string = list(s)
        part = list(part)

        while containsOccurence:
            
            new_current_string = []
            foundAnOccurence = False
            i = 0
            while i < len(current_string):
                if i + len(part) - 1 < len(current_string) and current_string[i: i + len(part)] == part:
                    print("Remove", current_string[i: i + len(part)])
                    foundAnOccurence = True
                    new_current_string += current_string[i + len(part) :]
                    print(new_current_string)
                    break
                else:
                    new_current_string.append(current_string[i])
                i += 1
            current_string = new_current_string
            containsOccurence = foundAnOccurence
                    
        return "".join(current_string)


