class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        j = 0
        for i in range(len(nums) - 1):
            #put number down in correct spot
            if nums[i] != nums[i + 1]:
                nums[j] = nums[i]
            else:
                nums[j] = nums[i] * 2
                nums[i + 1] = 0
            j += 1
        
        res = [0] * len(nums)
        j = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                res[j] = nums[i]
                j += 1
        
        return res

