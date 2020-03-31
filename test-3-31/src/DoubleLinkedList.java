/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-03-30
 * Time: 17:57
 */
class Node {
    private int val;
    private Node prev;
    private Node next;

    public Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
    public class DoubleLinkedList {
        private Node head = new Node(-1);
        private Node tail;

        public void setHead(Node head) {
            this.head = head;
        }

        public Node getHead() {
            return head;
        }

        //头插法
        public void addFirst(int data) {
            Node node = new Node(data);

            if(this.head.getNext()==null) {
                node.setPrev(this.head);
                this.head.setNext(node);
                return;
            }
            node.setPrev(this.head);
            node.setNext(this.head.getNext());
            this.head.getNext().setPrev(node);
            this.head.setNext(node);
        }
        //尾插法
        public void addLast(int data) {
            Node node = new Node(data);
            Node cur = this.head.getNext();
            if(cur==null) {
                node.setPrev(this.head);
                this.head.setNext(node);
                return;
            }
            while (cur.getNext()!=null) {
                cur = cur.getNext();
            }
            node.setPrev(cur);
            cur.setNext(node);
            this.tail = node;
        }
        //任意位置插入,第一个数据节点为0号下标
        public void addIndex(int index,int data) {
            Node node = new Node(data);
            Node cur = findIndex(index);
            if(this.head.getNext()==null) {
                addFirst(data);
                return;
            }
            if(index==size()) {
                addLast(data);
                return;
            }
            if(cur!=null) {
                node.setPrev(cur);
                node.setNext(cur.getNext());
                cur.getNext().setPrev(node);
                cur.setNext(node);
                return;
            }

        }
        //找index
        private Node findIndex(int index) {
            Node cur = this.head;
            if(index<0||index>size()){
                System.out.println("位置不合法");
                return null;
            }
            while (index>0) {
                if(cur.getNext()==null) {
                    return null;
                }
                cur = cur.getNext();
                index --;
            }
            return cur;
        }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key) {
            Node cur = this.head.getNext();
            while (cur!=null) {
                if(cur.getVal()==key) {
                    return true;
                }
                cur = cur.getNext();
            }
            return false;
        }
        //删除第一次出现关键字为key的节点
        public void remove(int key) {
            Node cur = this.head.getNext();
            while (cur!=null) {
                if(cur.getVal()==key) {
                    while (cur.getVal()==key) {
                        if(cur == this.tail) {
                            cur.getPrev().setNext(null);
                            cur.setPrev(null);
                            this.tail = cur.getPrev();
                        }else {
                            cur.getPrev().setNext(cur.getNext());
                            cur.getNext().setPrev(cur.getPrev());
                            cur = cur.getNext();
                            return;
                        }
                        return;
                    }
                    cur = cur.getNext();
                }
                cur = cur.getNext();
            }
            System.out.println("没有该节点");

        }
        //删除所有值为key的节点
        public void removeAllKey(int key) {
            Node cur = this.head.getNext();
            while (cur!=null) {
                if(cur.getVal()==key) {
                    while (cur.getVal()==key) {
                        if(cur == this.tail) {
                            cur.getPrev().setNext(null);
                            cur.setPrev(null);
                            this.tail = cur.getPrev();
                            return;
                        }else {
                            cur.getPrev().setNext(cur.getNext());
                            cur.getNext().setPrev(cur.getPrev());
                            cur = cur.getNext();
                        }
                    }
                    cur = cur.getNext();
                    if(cur==null) {
                        return;
                    }
                }
                cur = cur.getNext();
            }
            return;

        }
        //得到单链表的长度
        public int size() {
            Node cur = this.head.getNext();
            int count = 0;
            while (cur!=null) {
                count ++;
                cur = cur.getNext();
            }
            return count;

        }
        public void display() {
            if(this.head==null) {
                return;
            }
            Node cur = this.head.getNext();
            while (cur != null) {
                System.out.print(cur.getVal() + "  ");
                cur = cur.getNext();
            }
            System.out.println();

        }
        public void clear() {
            this.head = null;
            this.tail = null;
        }

    }

