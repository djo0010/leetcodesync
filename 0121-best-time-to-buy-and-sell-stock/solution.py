class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        currMax = 0
        currMin = prices[0]
        for num in prices:
            currMax = max(currMax, num - currMin)
            currMin = min(currMin, num)
        
        return currMax
