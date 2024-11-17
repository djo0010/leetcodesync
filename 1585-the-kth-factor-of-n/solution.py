class Solution:
    def kthFactor(self, n: int, k: int) -> int:
        count = 1
        if k == 1: return 1
        for i in range(2, int(n / 2) + 1):
            if n % i == 0:
                count += 1
                if count == k:
                    return i
        if count == k - 1: return n
        return -1
