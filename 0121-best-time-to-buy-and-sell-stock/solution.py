class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        currMin = prices[0]
        currMax = 0
        for price in prices:
            currMin = min(currMin, price)
            currMax = max(currMax, price - currMin)
        return currMax
