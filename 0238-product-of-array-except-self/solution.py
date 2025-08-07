class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        currProduct = 1
        prefix = [1] * len(nums)
        suffix = [1] * len(nums)
        
        for i in range(1, len(prefix)):
            prefix[i] = prefix[i-1] * nums[i - 1]
            

        for j in range(len(prefix)-2, -1, -1):
            suffix[j] = suffix[j+1] * nums[j+1]
        
        print(prefix)
        print(suffix)
            
        for x in range(len(nums)):
            prefix[x] *= suffix[x]
            print(prefix[x])
        
        return prefix
