# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

from collections import deque

class Solution:
    def largestValues(self, root: Optional[TreeNode]) -> List[int]:
        dq = deque()
        dq.append(root)
        maxes = []

        if root is None:
            return maxes

        while dq:
            currMax = float('-inf')
            levelSize = len(dq)

            for i in range(levelSize):
                currItem = dq.popleft()
                if currItem:
                    currMax = max(currItem.val, currMax)
                    if currItem.left:
                        dq.append(currItem.left)
                    if currItem.right:
                        dq.append(currItem.right)

            maxes.append(currMax)

        return maxes
            
