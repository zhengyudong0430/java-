import sun.font.CreatedFontTracker;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-16
 * Time: 15:55
 */
public class MyQueue {
    static class Node {
        private Node next;
        private int val;

        public Node(int val) {
            this.val = val;
        }
    }
        Node head = new Node(-1);
        Node tail = head;

        public void offer(int val) {
            Node newnode = new Node(val);
            tail.next = newnode;
            tail = tail.next;
        }

        public Integer pop() {
            if (head.next == null) {
                return null;
            }
            Node deletenode = head.next;
            head.next = deletenode.next;
            if (head.next == null) {
                tail = head;
            }
            return deletenode.val;
        }
        public Integer peek(){
            if(head.next==null) {
                return null;
            }
            return head.next.val;
        }

        public static void main(String[] args) {
            MyQueue queue = new MyQueue();
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
            queue.offer(4);
            while(true){
            Integer cur = queue.pop();
            if(cur==null) {
              break;
            }
                System.out.println(cur);
        }
        }
    }



