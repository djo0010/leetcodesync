class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        currSum = sum(nums[0:k])
        maxSum = currSum
        # 1 2 3 4 5 6 7
        #         ^ ^ ^
        for i in range(1, len(nums) - k + 1):
            currSum -= nums[i - 1]
            currSum += nums[i + k - 1]
            maxSum = max(currSum, maxSum)
        return maxSum / k
