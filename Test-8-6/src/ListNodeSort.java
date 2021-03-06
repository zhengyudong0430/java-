'
//对单链表进行排序,插入排序,时间复杂度O(n^2)
public static Node insertSortList(Node head) {
    if (head == null)
        return null;
    Node helper = new Node(0);// 辅助指针，防止头指针发生变化
    Node pre = helper;
    Node cur = head;
    while (cur != null) {
        Node next = cur.next;
        pre = helper;
        while (pre.next != null && pre.next.value <= cur.value) {
            pre = pre.next;
        }
        cur.next = pre.next;
        pre.next = cur;
        cur = next;
    }
    return helper.next;
}
 
//对单链表进行排序,归并排序,时间复杂度O(nlogn)
public static Node mergeSortList(Node head) {
    if (head == null || head.next == null)
        return head;
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node right = mergeSortList(slow.next);
    slow.next = null;
    Node left = mergeSortList(head);
    // /待左右两边各自有序，进行归并即可
    Node temp_head = new Node(0);
    Node temp_node = temp_head;
    while (left != null && right != null) {
        if (left.value < right.value) {
            temp_node.next = left;
            left = left.next;
        } else {
            temp_node.next = right;
            right = right.next;
        }
        temp_node = temp_node.next;
    }
    if (left != null)
        temp_node.next = left;
    if (right != null)
        temp_node.next = right;
    return temp_head.next;
}