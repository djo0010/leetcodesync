class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        maxCount = 0
        for i in range(len(nums)):
            currCount = 1
            while i + 1 < len(nums) and nums[i] < nums[i + 1]:
                currCount += 1
                i += 1
            maxCount = max(currCount, maxCount)
            currCount = 1
            while i + 1 < len(nums) and nums[i] > nums[i + 1]:
                currCount += 1
                i += 1
            maxCount = max(currCount, maxCount)
        return maxCount
