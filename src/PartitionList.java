/**
 * Created by kaijiezhou on 12/30/15.
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode less=new ListNode(0);
        ListNode lessHead=less;
        ListNode more=new ListNode(0);
        ListNode moreHead=more;
        while(head!=null){
            if(head.val<x){
                less.next=head;
                less=less.next;
            }else{
                more.next=head;
                more=more.next;
            }
            head=head.next;
        }
        less.next=moreHead.next;
        more.next=null;
        return lessHead.next;
    }
}
