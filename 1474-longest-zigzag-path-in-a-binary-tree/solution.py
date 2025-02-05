# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def longestZigZag(self, root: Optional[TreeNode]) -> int:
        maxLength = 0

        def longestZigZagHelper(node: Optional[TreeNode], currSize: int, currDirection: str):
            nonlocal maxLength
            if node is None:
                return
            maxLength = max(maxLength, currSize)
            if currDirection == "left":
                longestZigZagHelper(node.right, currSize + 1, "right")
                longestZigZagHelper(node.left, 1, "left")
            if currDirection == "right":
                longestZigZagHelper(node.left, currSize + 1, "left")
                longestZigZagHelper(node.right, 1, "right" )
                

        if root:
            longestZigZagHelper(root.left, 1, "left")
            longestZigZagHelper(root.right, 1, "right")
        return maxLength
    

