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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null;
        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        else if (list1 == null && list2 == null) return null;
        else {
            if (list1.val < list2.val) {
                res = new ListNode(list1.val);
                list1 = list1.next;
            }
            else {
                res = new ListNode(list2.val);
                list2 = list2.next;
            }

            ListNode resItterator = res;

            while (list1 != null || list2 != null) {
                if (list1 != null && list2 != null) {
                    if (list1.val < list2.val) {
                        resItterator.next = new ListNode(list1.val);
                        resItterator = resItterator.next;
                        list1 = list1.next;
                    }
                    else {
                        resItterator.next = new ListNode(list2.val);
                        resItterator = resItterator.next;
                        list2 = list2.next;
                    }
                }
                else if (list1 != null && list2 == null) {
                    resItterator.next = new ListNode(list1.val);
                    resItterator = resItterator.next;
                    list1 = list1.next;
                }
                else if (list2 != null && list1 == null) {
                    resItterator.next = new ListNode (list2.val);
                    resItterator = resItterator.next;
                    list2 = list2.next;
                }
            }
            return res;
        }
    }
}
