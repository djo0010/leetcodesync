class Solution:
    def maxEqualRowsAfterFlips(self, matrix: List[List[int]]) -> int:
        counts = {}
        for row in range(len(matrix)):
            binary_number = int(''.join(map(str, matrix[row])), 2)
            num_bits = len(matrix[0])
            mask = (1 << num_bits) - 1
            flipped_binary_number = binary_number ^ mask
            if binary_number in counts:
                counts[binary_number] += 1
            elif flipped_binary_number in counts:
                counts[flipped_binary_number] += 1
            else:
                counts[binary_number] = 1
        return max(counts.values())
