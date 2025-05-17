class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        zeroCount = 0
        oneCount = 0
        twoCount = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                zeroCount += 1
            if nums[i] == 1:
                oneCount += 1
            if nums[i] == 2:
                twoCount += 1
        
        for j in range(len(nums)):
            if zeroCount != 0:
                nums[j] = 0
                zeroCount -= 1
            elif oneCount != 0:
                nums[j] = 1
                oneCount -= 1
            else:
                nums[j] = 2
        
