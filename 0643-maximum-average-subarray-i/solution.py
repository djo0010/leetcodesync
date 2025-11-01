class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        maxSum = sum(nums[0:k])
        currSum = maxSum

        for i in range(1, len(nums) - k + 1 ):
            currSum -= nums[i - 1]
            currSum += nums[i + k - 1]
            maxSum = max(currSum, maxSum)
        return maxSum / k
