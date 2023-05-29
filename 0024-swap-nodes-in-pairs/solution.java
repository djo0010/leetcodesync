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
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode res = new ListNode(head.next.val);
        res.next = new ListNode(head.val);
        ListNode itt1 = head;
        ListNode itt2 = head.next;
        ListNode resItterator = res.next;
        while (itt1.next.next != null && itt2.next.next != null) {
            itt2 = itt2.next.next;
            resItterator.next = new ListNode(itt2.val);
            
            resItterator = resItterator.next;

            itt1 = itt1.next.next;
            resItterator.next = new ListNode(itt1.val);
            
            resItterator = resItterator.next;
        }
        if (itt1.next.next == null) return res;
        if (itt2.next.next == null) {
            itt1 = itt1.next.next;
            resItterator.next = new ListNode(itt1.val);
            return res;
        }
        return res;
    }
}
