class Solution:
    def missingInteger(self, nums: List[int]) -> int:
        
        i = 1
        currMaxPrefixSum = nums[0]
        while i < len(nums) and nums[i] == nums[i - 1] + 1:
            currMaxPrefixSum += nums[i]
            i += 1

        #next pass is to find the first number greater than or equal to the sum of the prefix sums

        while currMaxPrefixSum in nums:
            currMaxPrefixSum += 1
        
        return currMaxPrefixSum

