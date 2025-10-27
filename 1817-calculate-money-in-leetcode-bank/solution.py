class Solution:
    def totalMoney(self, n: int) -> int:
        startNum = 1
        iterationNum = 1
        currentAdd = 1
        total = 0
        for i in range(n):
            total += currentAdd
            currentAdd += 1
            if currentAdd % 7 == iterationNum:
                startNum += 1
                iterationNum += 1
                iterationNum %= 7
                currentAdd = startNum
        
        return total
