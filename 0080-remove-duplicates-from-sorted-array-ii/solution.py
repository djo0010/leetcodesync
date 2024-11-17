class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        resultIndex = 1
        for currIndex in range(2, len(nums)):
            if resultIndex - 1 == -1 or nums[currIndex] != nums[resultIndex - 1]:
                resultIndex += 1
                nums[resultIndex] = nums[currIndex]
        return resultIndex + 1
