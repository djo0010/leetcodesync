class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        border = tickets[k]
        res = 0
        biggerAndBehind = 0
        for i in range(len(tickets)):
            if i > k and tickets[i] >= border:
                biggerAndBehind += 1
            if tickets[i] <= border:
                res += tickets[i]
            else:
                res += border
        return res - biggerAndBehind
        


