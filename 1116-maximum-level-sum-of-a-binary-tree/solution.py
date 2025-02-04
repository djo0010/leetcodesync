# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        if not root:
            return []

        q = deque()
        q.append(root)
        bestLayer = 0
        maxSum = -1000000
        currLayer = 0
        while q:
            itemsInLevel = len(q)
            currSum = 0
            currLayer += 1
            for _ in range(itemsInLevel):
                item = q.popleft()
                currSum += item.val
                if item.left:
                    q.append(item.left)
                if item.right:
                    q.append(item.right)

            print(currSum, maxSum, currLayer)
            if currSum > maxSum:
                maxSum = currSum
                bestLayer = currLayer
        return bestLayer
