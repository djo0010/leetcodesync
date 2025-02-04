class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        maxSum = 0
        for i in range(len(nums)):
            currSum = nums[i]
            while i + 1 < len(nums) and nums[i] < nums[i + 1]:
                currSum += nums[i + 1]
                i += 1
            maxSum = max(currSum, maxSum)
            i += 1
        return maxSum
