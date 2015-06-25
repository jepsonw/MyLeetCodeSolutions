/**
 * Created by kaijiezhou on 6/25/15.
 */
public class RmNthFromEndLinkList {
    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode ahead=head;
        ListNode back=head;
        ListNode preBack=null;
        for(int i=0;i<n;i++){
            ahead=ahead.next;
            if(ahead==null) return null;
        }
        while(ahead.next!=null){
            ahead=ahead.next;
            preBack=back;
            back=back.next;
        }
        if(preBack!=null){
            preBack.next=back.next;
        }else{
            head=back.next;
        }
        return head;

    }
}
