'
//�Ե������������,��������,ʱ�临�Ӷ�O(n^2)
public static Node insertSortList(Node head) {
    if (head == null)
        return null;
    Node helper = new Node(0);// ����ָ�룬��ֹͷָ�뷢���仯
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
 
//�Ե������������,�鲢����,ʱ�临�Ӷ�O(nlogn)
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
    // /���������߸������򣬽��й鲢����
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