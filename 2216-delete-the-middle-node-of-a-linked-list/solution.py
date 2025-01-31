# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:

        count = 0
        tracker = head
        while tracker != None:
            count += 1
            tracker = tracker.next
        middle = count // 2

        middleCount = 0
        tracker = head
        if middle == 0:
            return None
            
        while middleCount != middle - 1:
            middleCount += 1
            tracker = tracker.next

        tracker.next = tracker.next.next
        return head

        
        

