class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        totalSum = nums[0]
        for i in range(1, len(nums)):
            totalSum += nums[i]
            nums[i] += nums[i - 1]
        count = 0
        
        for i in range(len(nums) - 1):
            left = nums[i]
            right = totalSum - left
            if (left - right) % 2 == 0:
                count += 1
        return count
            
