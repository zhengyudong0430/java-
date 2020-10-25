import java.util.*;


 class ListNode {
   int val;
   ListNode next = null;
  }


public class Solution {
    /**
     * 排队
     * @param head ListNode类 头结点
     * @return ListNode类
     */
    public ListNode lineUp (ListNode head) {
        if(head==null) {
            return null;
        }
        ListNode start1 = null;
        ListNode start2 = null;
       ListNode newHead = head;
       ListNode cur=head;
        while (cur!=null) {
            newHead = cur;
            cur.next = cur.next.next;
            cur = cur.next.next;
        }
        ListNode cur1 = newHead.next;
        ListNode newHead2 = null;
        while (cur1!=null) {
            newHead2 = cur1;
            cur1.next = cur1.next.next;
            cur1 = cur1.next.next;
        }
        cur.next = newHead2;
        return newHead;
    }
}