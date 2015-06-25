/**
 * Created by kaijiezhou on 6/25/15.
 */
public class MergeSortedLinkedList {
    public class ListNode {
            int val;
             ListNode next;
             ListNode(int x) { val = x; }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head, tail;
        ListNode node1=l1;
        ListNode node2=l2;
        if(l1.val>l2.val){
            head=l2;
            node2=l2.next;
        }else{
            head=l1;
            node1=l1.next;
        }
        tail=head;
        while(node1!=null&&node2!=null){
            if(node1.val>node2.val){
                tail.next=node2;
                node2=node2.next;
            }else{
                tail.next=node1;
                node1=node1.next;
            }
            tail=tail.next;
        }
        if(node1==null){
            while(node2!=null){
                tail.next=node2;
                tail=tail.next;
                node2=node2.next;
            }
        }else if(node2==null){
            while(node1!=null){
                tail.next=node1;
                tail=tail.next;
                node1=node1.next;
            }
        }
        return head;
    }
}
