class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        if k == 0:
            return [0 for i in code]

        #prefix sum extended by k?
        #5 7 1 4 
        #5 12 13 17 22 29 30
        
        if k > 0:
            prefixSum = code.copy()
            prefixSum.extend(code[0:k])
            for i in range(1, len(prefixSum)):
                prefixSum[i] += prefixSum[i - 1] 
            for j in range(len(code)):
                code[j] = prefixSum[j + k] - prefixSum[j]
            return code
        
        if k < 0:
            prefixSum = [0] * (len(code) + abs(k))
        
            for i in range(0, len(prefixSum)):
                prefixSum[i] = code[(len(code) - i - 1) % len(code)]
            for i in range(1, len(prefixSum)):
                prefixSum[i] += prefixSum[i - 1] 
            index = len(prefixSum) - 1
            for i in range(len(code)):
                code[i] = prefixSum[index] - prefixSum[index - abs(k)]
                index -= 1
            return code
                
