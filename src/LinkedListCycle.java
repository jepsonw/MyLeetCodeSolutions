/**
 * Created by kaijiezhou on 12/24/15.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode ptr1=head;
        ListNode ptr2=head.next;
        while (ptr1 != ptr2){
            if(ptr1==null||ptr2==null||ptr2.next==null){
                return false;
            }
            ptr1=ptr1.next;
            ptr2=ptr2.next.next;
        }
        return true;
    }
}
