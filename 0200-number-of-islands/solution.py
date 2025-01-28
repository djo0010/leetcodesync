class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        #gets length of grid in x and y directions
        x, y = len(grid), len(grid[0])
        #all directions to check
        dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]
        numOfIslands = 0

        def dfs(row, col) -> bool:
            grid[row][col] = '0'
            for directionX, directionY in dirs:
                rowToCheck, colToCheck = row + directionX, col + directionY
                if 0 <= rowToCheck < x and 0 <= colToCheck < y and grid[rowToCheck][colToCheck] == "1":
                    dfs(rowToCheck, colToCheck)
            

        for i in range(x):
            for j in range(y):
                if grid[i][j] == '1':
                    numOfIslands += 1
                    dfs(i, j)
        return numOfIslands

    

