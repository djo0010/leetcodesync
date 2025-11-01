class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        currMin = prices[0]
        currProfit = 0

        for price in prices:
            currMin = min(currMin, price)
            currProfit = max(price - currMin, currProfit)

        return currProfit
