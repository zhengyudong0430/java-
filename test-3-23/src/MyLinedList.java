class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinedList {
    public Node head;

    public MyLinedList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data){
        Node node = new Node (data) ;
        if (this. head == null){
            //第一次插入 节点
            this. head = node;
            return ;
        }
        node. next = this. head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data){

    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node crr = this.head;
        while(crr!=null) {
            if(crr.data==key) {
                return true;
            }
            crr=crr.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){

    }
    //得到单链表的长度
    public int size(){
        Node crr = this.head;
        int count = 0;
        while(crr!=null) {
            crr=crr.next;
            count++;
        }
        return count;
    }

    public void display(){

    }
    public void clear(){

    }
}
