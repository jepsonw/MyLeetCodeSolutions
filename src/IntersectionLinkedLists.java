public class IntersectionLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=getLength(headA);
        int lengthB=getLength(headB);
        if(lengthA==0||lengthB==0) return null;
        if(lengthA>lengthB){
        	return findInserton(headA, headB, lengthA-lengthB);
        }else {
			return findInserton(headB, headA, lengthB-lengthA);
		}
    }
	private int getLength(ListNode head){
		ListNode curNode=head;
		int length=0;
		while (curNode!=null){
        	++length;
        	curNode=curNode.next;
        }
		return length;
	}
	private ListNode findInserton(ListNode longHead, ListNode shortHead,int diff){
		for(int i=0;i<diff;i++){
			longHead=longHead.next;
		}
		while(!longHead.equals(shortHead)){
			longHead=longHead.next;
			shortHead=shortHead.next;
			if(longHead==null||shortHead==null) return null;
		}
		return longHead;
	}
	
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
