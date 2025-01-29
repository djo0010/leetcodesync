class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        prefixSum = [0] * len(nums)
        prefixSum[0] = nums[0]
        total = sum(nums)
        for i in range(0, len(nums)):
            if i - 1 >= 0:
                prefixSum[i] = nums[i] + prefixSum[i - 1]
            if i - 1 >= 0 and total - nums[i] == prefixSum[i - 1] * 2:
                return i
            elif i-1 < 0 and total - nums[i] == 0:
                return i
            

        return -1
        
        

