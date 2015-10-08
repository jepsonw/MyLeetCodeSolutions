/**
 * Created by kaijiezhou on 10/5/15.
 */
public class RmDupFromSortedListII {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode realHeadPtr=new ListNode(-1);
        realHeadPtr.next=head;
        ListNode prev=realHeadPtr;
        ListNode start=head;
        ListNode end=head.next;
        while(end!=null){
            if(start.val==end.val){
                end=end.next;
            }else if(start.next!=end){
                prev.next=end;
                if(prev.next==null) return null;
                start=prev.next;
                end=start.next;
            }else{
                prev=start;
                start=start.next;
                end=end.next;
            }
        }
        if(start.next!=null){
            prev.next=null;
        }
        return realHeadPtr.next;
    }
}

