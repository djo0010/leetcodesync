# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        currMinDepth = 10000

        def minDepthHelper(root, currDepth):
            nonlocal currMinDepth
            if root is None:
                return
            if root.left is None and root.right is None:
                currMinDepth = min(currDepth + 1, currMinDepth)
            if currDepth > currMinDepth:
                return 
            
            minDepthHelper(root.left, currDepth + 1)
            minDepthHelper(root.right, currDepth + 1)
        
        if root is None:
            return 0

        minDepthHelper(root, 0)

        return currMinDepth

        
