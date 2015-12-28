from tools import ListNode

__author__ = 'kaijiezhou'


class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        carry=0
        result_ptr=ListNode(-1)
        cur_node=result_ptr
        while True:
            if l1 is not None and l2 is not None:
                val = l1.val+l2.val+carry
                carry = val/10
                val %= 10
                cur_node.next=ListNode(val)
                l1=l1.next
                l2 = l2.next
                cur_node = cur_node.next
            elif l1 is not None:
                val = l1.val+carry
                carry=val/10
                val %=10
                cur_node.next=ListNode(val)
                l1=l1.next
                cur_node = cur_node.next
            elif l2 is not None:
                val=l2.val+carry
                carry = val/10
                val %= 10
                cur_node.next = ListNode(val)
                l2 = l2.next
                cur_node = cur_node.next
            elif carry is not 0:
                cur_node.next=ListNode(carry)
                break
            else:
                break
        return result_ptr.next