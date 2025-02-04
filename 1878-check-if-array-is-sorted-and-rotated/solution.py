class Solution:
    def check(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            if i + 1 < len(nums) and nums[i] > nums[i + 1]:
                firstDecreasingIndex = i
                i += 1
                lastValue = nums[i]
                while i != firstDecreasingIndex:
                    i += 1
                    i %= len(nums)
                    if lastValue > nums[i]:
                        return False
                    lastValue = nums[i]
                return True     
        return True
