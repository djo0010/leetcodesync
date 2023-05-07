import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String s1 = "";
        while (l1 != null) {
            s1 += l1.val;
            l1 = l1.next;
        }

        String s2 = "";
        while (l2 != null) {
            s2 += l2.val;
            l2 = l2.next;
        }

        String str1 = new StringBuilder(s1).reverse().toString();      
        String str2 = new StringBuilder(s2).reverse().toString();
        BigInteger val1 = new BigInteger(str1);     
        BigInteger val2 = new BigInteger(str2); 

        BigInteger res = val1.add(val2);

        String resString = res.toString();

        //807 > return linked list of 708. 8 is back 7 is front
        ListNode result = new ListNode(Character.getNumericValue(resString.charAt(0)));
        int indexer = 1;
        while (indexer < resString.length()) {
            ListNode toAdd = new ListNode(Character.getNumericValue(resString.charAt(indexer)), result);
            result = toAdd;
            indexer++;
        } 
        return result; 
    }
}

