class Solution:
    def findMaxFish(self, grid: List[List[int]]) -> int:
        #gets length of grid in x and y directions
        x, y = len(grid), len(grid[0])
        #all directions to check
        dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]
        maxFish = 0
        currFish = 0

        def dfs(row, col) -> int:
            nonlocal currFish
            currFish += grid[row][col]
            grid[row][col] = 0
            for directionX, directionY in dirs:
                rowToCheck, colToCheck = row + directionX, col + directionY

                if 0 <= rowToCheck < x and 0 <= colToCheck < y and grid[rowToCheck][colToCheck] > 0:
                    dfs(rowToCheck, colToCheck)
            

        for i in range(x):
            for j in range(y):
                if grid[i][j] > 0:
                    currFish = 0
                    dfs(i, j)
                    maxFish = max(currFish, maxFish)
        return maxFish

    

