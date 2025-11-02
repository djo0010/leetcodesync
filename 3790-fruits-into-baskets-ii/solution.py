class Solution:
    def numOfUnplacedFruits(self, fruits: List[int], baskets: List[int]) -> int:
        count = 0

        def findAndFillBasket(fruit):
            for i in range(len(baskets)):
                if fruit <= baskets[i]:
                    baskets[i] = 0
                    return True
            return False

        for i in range(len(fruits)):
            if findAndFillBasket(fruits[i]):
                count += 1
        
        return len(baskets) - count
