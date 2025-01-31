class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        firstSet = set(nums1)
        secondSet = set(nums2)
        firstSetRes = set()
        secondSetRes = set()
        for i in secondSet:
            if i not in firstSet:
                secondSetRes.add(i)
        for i in firstSet:
            if i not in secondSet:
                firstSetRes.add(i)
        
        return [list(firstSetRes), list(secondSetRes)]
