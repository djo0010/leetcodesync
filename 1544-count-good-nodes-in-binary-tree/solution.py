# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.count = 0    

    def goodNodesHelper(self, node: TreeNode, currMax: int):
        if node == None:
            return
        if node.val >= currMax:
            currMax = node.val
            self.count += 1
        self.goodNodesHelper(node.left, currMax)
        self.goodNodesHelper(node.right, currMax)
        

    def goodNodes(self, root: TreeNode) -> int:
        self.goodNodesHelper(root, root.val)
        return self.count

    
