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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode trueItterator = head;
        ListNode findEnd = head;
        if (n == 1 && head.next == null) {
            head = null;
            return head;
        }
        if (n == 1 && head.next != null) {
            while (trueItterator.next.next != null) {
                trueItterator = trueItterator.next;
            }
            trueItterator.next = null;
            return head;
        }

        if (n == 2 && head.next.next == null) {
            head = head.next;
            return head;
        }

        while (n >= 0) {
            try {
                findEnd = findEnd.next;
            }
            catch (Exception e) {
                head = head.next;
                return head;
            }
            n--;
        }
        while (findEnd != null) {
            trueItterator = trueItterator.next;
            findEnd = findEnd.next;
        }
        if (trueItterator.next.next == null)
            trueItterator.next = null;
        else  trueItterator.next = trueItterator.next.next;
        return head;
    }
}
