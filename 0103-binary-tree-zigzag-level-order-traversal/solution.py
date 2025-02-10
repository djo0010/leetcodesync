# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None:
            return []
        
        q = deque()
        q.append(root)
        traversals = []
        reverseThisRound = False
        
        while q:
            levelSize = len(q)
            currLevel = []
            
            for i in range(levelSize):
                element = q.popleft()
                if element:
                    currLevel.append(element.val)
                    if element.left:
                        q.append(element.left)
                    if element.right:
                        q.append(element.right)
                        
            if reverseThisRound == True:
                reversedLevel = currLevel[::-1]
                traversals.append(reversedLevel)
                reverseThisRound = False
            else:
                traversals.append(currLevel)
                reverseThisRound = True
        
        return traversals
            
            
