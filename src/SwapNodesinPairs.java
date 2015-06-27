/**
 * Created by kaijiezhou on 6/27/15.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode first=head;
        ListNode second=head.next;
        ListNode preFirst;
        first.next=second.next;
        second.next=first;
        head=second;
        if(first.next==null) return head;
        preFirst=first;
        first=preFirst.next;
        second=first.next;
        while(second!=null){
            preFirst.next=second;
            first.next=second.next;
            second.next=first;
            preFirst=first;
            first=preFirst.next;
            if(first==null) break;
            second=first.next;
        }
        return head;
    }
}
