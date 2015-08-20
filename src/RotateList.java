/**
 * Created by kaijiezhou on 15-8-20.
 */
public class RotateList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode end=head;
        ListNode newEnd=head;
        int length=1;
        while(end.next!=null){
            ++length;
            end=end.next;
        }
        k%=length;
        if(k==0) return head;
        for(int i=1;i<length-k;i++) newEnd=newEnd.next;
        end.next=head;
        head=newEnd.next;
        newEnd.next=null;
        return head;
    }
}
