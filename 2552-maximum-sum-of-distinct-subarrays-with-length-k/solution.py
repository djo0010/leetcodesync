
class Solution:
    def maximumSubarraySum(self, nums: List[int], k: int) -> int:
        chars = {}
        for i in range(k):
            if nums[i] in chars:
                chars[nums[i]] += 1
            else:
                chars[nums[i]] = 1
        currResult = sum(nums[0:k])
        trueResult = 0
        if len(chars) == k:
            trueResult = currResult
        else: 
            trueResult = 0
        for i in range(1, len(nums) - k + 1):
            currResult -= nums[i - 1] 
            currResult += nums[i + k - 1]
            if nums[i + k - 1] in chars:
                chars[nums[i+k-1]] = chars[nums[i + k- 1]] + 1
            else:
                chars[nums[i+k-1]] = 1
    
            if nums[i - 1] in chars:
                chars[nums[i - 1]] -= 1
                if chars[nums[i-1]] == 0:
                    del chars[nums[i-1]]
            if len(chars) == k:
                trueResult = max(trueResult, currResult)
        return trueResult
