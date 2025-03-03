class Solution:
    def mergeArrays(self, nums1: List[List[int]], nums2: List[List[int]]) -> List[List[int]]:

        res = [[i, 0] for i in range(1, max(nums1[-1][0], nums2[-1][0]) + 1)]
        
        for i, element in nums1:
            res[i - 1][1] += element

        for i, element in nums2:
            res[i - 1][1] += element
        
        for i in range(len(res) - 1, -1, -1):
            if res[i][1] == 0:
                res.pop(i)
        return res

         
