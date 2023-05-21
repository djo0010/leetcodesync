/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        return removeElementsHelper(head, val, head);

    }

    private ListNode removeElementsHelper(ListNode head, int val, ListNode origin) {
        if (origin == null) return origin;
        if (origin.val == val) origin = origin.next;
        if (head == null) return origin;
        if (head.next == null) return origin;
        if (head.next.val == val) {
            head.next = head.next.next;
            return removeElementsHelper(head, val, origin);
        }
        if (head.next.val != val) return removeElementsHelper(head.next, val, origin);
        return origin;
    }
}
