class Solution:
    def findChampion(self, n: int, edges: List[List[int]]) -> int:
        marker = [0] * n
        for array in edges:
            marker[array[1]] = 1
        currWinner = None
        for i in range(len(marker)):
            if marker[i] == 0 and currWinner == None:
                currWinner = i
            elif marker[i] == 0 and currWinner != None:
                return -1
        return currWinner
