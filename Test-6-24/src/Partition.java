import java.util.*;


class ListNode {
   int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
}

public class Partition {
    public  ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode small = null;
        ListNode smallEnd = null;
        ListNode big = null;
        ListNode bigEnd = null;
        ListNode cur = pHead;
while (cur!=null) {
    if(cur.val<x) {
        if(small==null) {
            small = cur;
        }else{
            smallEnd.next = cur;
        }
        smallEnd = cur;
    }
    if(cur.val>=x) {
        if(big==null) {
            big = cur;
        }else{
            bigEnd.next = cur;
        }
        bigEnd = cur;
    }
    cur = cur.next;
}
if(small==null) {
    return big;
}
if(big==null) {
    return small;
}
smallEnd.next = big;
if(bigEnd!=null) {
    bigEnd.next = null;
}
return small;
}
}