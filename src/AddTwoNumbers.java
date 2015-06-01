/**
 * Created by kaijiezhou on 6/1/15.
 */

public class AddTwoNumbers {
    //Digits are in reverse order, that is, 765 is represented as 5->6->7
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        ListNode head, cur, cur1, cur2;
        head = new ListNode(sum % 10);
        int carry = sum / 10;
        cur = head;
        cur1 = l1.next;
        cur2 = l2.next;
        while (cur1 != null || cur2 != null) {
            if (cur1 == null) {
                sum = cur2.val + carry;
                cur2 = cur2.next;
            } else if (cur2 == null) {
                sum = cur1.val + carry;
                cur1 = cur1.next;
            } else {
                sum = cur1.val + cur2.val + carry;
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;
            cur = cur.next;
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return head;

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
