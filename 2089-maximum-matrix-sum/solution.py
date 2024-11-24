class Solution:
    def maxMatrixSum(self, matrix: List[List[int]]) -> int:
        s = 0
        n = 0
        m = float('inf')
        for row in range(len(matrix)):
            for col in range(len(matrix[row])):
                s += abs(matrix[row][col])
                m = min(m, abs(matrix[row][col]))
                if matrix[row][col] < 0:
                    n += 1
        if n % 2 == 0:
            return s
        else:
            return s - 2 * m
