class Solution:
    def canJump(self, nums: List[int]) -> bool:
        i = 0
        while i < len(nums):
            currentJumpLength = nums[i]
            numbersChecked = 0
            currentJumpIndex = i
        
            i += 1
            while i < len(nums) and numbersChecked < currentJumpLength:
                currentItemInJump = nums[i]
                if currentItemInJump + i > currentJumpIndex + currentJumpLength:
                    break
                i += 1
                numbersChecked += 1
            if i >= len(nums):
                return True
            if numbersChecked == currentJumpLength:
                return False
            

            
