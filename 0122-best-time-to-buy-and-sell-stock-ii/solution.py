class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        currBuy = prices[0]
        totalProfit = 0

        for price in prices:
            if price > currBuy:
                totalProfit += price - currBuy
                currBuy = price
            elif price < currBuy:
                currBuy = price
        
        return totalProfit
