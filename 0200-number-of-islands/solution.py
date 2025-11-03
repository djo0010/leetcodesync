class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        count = 0

        def dfs(x, y):
            nonlocal count

            if not 0 <= x < len(grid[0]) or not 0 <= y < len(grid) or grid[y][x] == "0":
                return

            grid[y][x] = "0"

            for a,b in [(0,1),(0,-1),(1,0),(-1,0)]:
                dfs(x + a, y + b)
                
        for i in range(len(grid[0])):
            for j in range(len(grid)):
                if grid[j][i] == "1":
                    count += 1
                    dfs(i,j)
        
        return count
                        

    

