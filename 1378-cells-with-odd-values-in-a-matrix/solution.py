class Solution:
    def oddCells(self, m: int, n: int, indices: List[List[int]]) -> int:
        #build matrix
        matrix = [[0] * n for _ in range(m)]

        def markMatrix(matrix):
            def markRow(row):
                for i in range(n):
                    matrix[row][i] += 1

            def markCol(col):
                for i in range(m):
                    matrix[i][col] += 1

            for x,y in indices:
                markRow(x)
                markCol(y)
        
        markMatrix(matrix)

        count = 0
        for x in range(n):
            for y in range(m):
                if matrix[y][x] % 2 == 1:
                    count += 1

        return count         


