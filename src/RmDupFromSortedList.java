/**
 * Created by kaijiezhou on 10/6/15.
 */
public class RmDupFromSortedList {
    class ListNode {
            int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode cur=head;
        ListNode next=head.next;
        while(next!=null){
            if(cur.val==next.val){
                next=next.next;
            }else if(cur.next!=next){
                cur.next=next;
                cur=next;
                next=next.next;
            }else{
                cur=cur.next;
                next=next.next;
            }
        }
        cur.next=null;
        return head;
    }
}
