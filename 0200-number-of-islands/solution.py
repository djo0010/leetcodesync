class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        
        
        count = 0
        
        def dfs(row: int, col: int, grid: List[List[str]]):
            dirs = [(0,1),(0,-1),(1,0),(-1,0)]
            if grid[row][col] == "0":
                return
            grid[row][col] = "0"
            
            for dx, dy in dirs:
                newRow = row + dx
                newCol = col + dy
                if 0 <= newRow < len(grid) and 0 <= newCol < len(grid[0]):
                    dfs(newRow, newCol, grid)
            
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col] == "1":
                    count += 1
                    dfs(row, col, grid)
                    
        
        return count

            
        
