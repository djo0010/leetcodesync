# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []

        q = deque()
        q.append(root)
        res = []

        while q:
            itemsInLevel = len(q)
            tmp = []
            currRightMost = -101
            for _ in range(itemsInLevel):
                item = q.popleft()
                if item:
                    currRightMost = item.val
                tmp.append(item.val)
                if item.left:
                    q.append(item.left)
                if item.right:
                    q.append(item.right)
            if currRightMost != -101:        
                res.append(currRightMost)
        return res



