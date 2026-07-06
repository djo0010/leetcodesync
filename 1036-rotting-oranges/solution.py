from collections import deque

class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        lenY, lenX = len(grid), len(grid[0])
        q = deque()
        fresh = 0

        for y in range(lenY):
            for x in range(lenX):
                if grid[y][x] == 2:
                    q.append((x, y))
                elif grid[y][x] == 1:
                    fresh += 1

        time = 0
        dirs = [(0, 1), (0, -1), (1, 0), (-1, 0)]

        while q and fresh > 0:
            time += 1
            for _ in range(len(q)):  # process one full minute (level)
                ex, ey = q.popleft()
                for dx, dy in dirs:
                    nx, ny = ex + dx, ey + dy
                    if 0 <= nx < lenX and 0 <= ny < lenY and grid[ny][nx] == 1:
                        grid[ny][nx] = 2
                        fresh -= 1
                        q.append((nx, ny))

        return time if fresh == 0 else -1
