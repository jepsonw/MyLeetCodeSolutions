/**
 * Created by kaijiezhou on 6/27/15.
 */
public class MergeKSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length<1) return null;
        return mergePart(lists,0,lists.length-1);

    }
    private ListNode mergePart(ListNode[]list, int begin, int end){
        if(end==begin) return list[begin];
        if(end-begin==1) return mergeTwoLists(list[begin],list[end]);
        return mergeTwoLists(mergePart(list,begin,(begin+end)/2), mergePart(list,(begin+end)/2+1,end));
    }
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
