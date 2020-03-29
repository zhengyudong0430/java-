/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-03-29
 * Time: 15:23
 */
class LinkedListNode{
    public int val;
    public LinkedListNode prev;
    public LinkedListNode next;
    public LinkedListNode(int val) {
        this.val = val;
    }
}
public class DoubleLinkedList {
    public LinkedListNode head;
    public LinkedListNode last;
    //头插法
    public void addFirst(int data){
    LinkedListNode node = new LinkedListNode(data);
    if(this.head==null&&this.last==null) {
        this.head = node;
        this.last = node;
    }
    else{
        this.head.prev = node;
        node.next = head;
        this.head = node;
    }
    }
    //尾插法
    public void addLast(int data){
        LinkedListNode node = new LinkedListNode(data);
        if(head==null&&last==null) {
            this.head = node;
            this.last = node;
        }
        else{
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }



    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index<0||index>size()) {
            throw new RuntimeException("位置不合法");
        }
        if(index==0) {
            addFirst(data);
            return;
        }
        if(index==size()) {
            addLast(data);
            return;
        }
        LinkedListNode node = new LinkedListNode(data);
        LinkedListNode cur = this.head;
        int count=0;
        while(count<index) {
            cur = cur.next;
            count++;
        }
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
        node.prev.next = node;


    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        LinkedListNode cur = this.head;
        while(cur!=null){
            if(cur.val==key) {
                return  true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        LinkedListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                //当前cur是不是头结点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }
                 else if(cur==this.last) {
                    this.last=this.last.prev;
                    this.last.next = null;
                }
                else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }

            }
                cur = cur.next;

        }

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        LinkedListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                //当前cur是不是头结点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }
                else if(cur==this.last) {
                    this.last=this.last.prev;
                    this.last.next = null;
                }
                else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }

            }
            cur = cur.next;

        }


    }
    //得到单链表的长度
    public int size(){

        LinkedListNode cur = this.head;
        int count=0;
        while(cur!=null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    public void display(){
        LinkedListNode cur = this.head;
        while(cur!=null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }

    }
    public void clear(){
        this.head=null;
        this.last=null;

    }
}
