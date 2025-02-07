class Solution:
    def nearestExit(self, maze: List[List[str]], entrance: List[int]) -> int:
        rows, cols = len(maze), len(maze[0])
        dirs = [(1, 0), (-1, 0), (0, 1), (0, -1)]
        q = deque()
        q.append((entrance[0], entrance[1], 0))
        maze[entrance[0]][entrance[1]] = "+"

        while q:
            row, col, steps = q.popleft()
            for dx, dy in dirs:
                newRow, newCol = row + dx, col + dy
                if 0 <= newRow < rows and 0 <= newCol < cols and maze[newRow][newCol] != "+":
                    if (newRow == 0 or newCol == 0 or newRow == rows - 1 or newCol == cols - 1):
                        return steps + 1
                    maze[newRow][newCol] = "+"
                    q.append((newRow, newCol, steps + 1))
        return -1


        


