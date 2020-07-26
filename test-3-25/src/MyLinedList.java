import org.omg.CORBA.NO_IMPLEMENT;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-03-25
 * Time: 16:45
 */
class Node {
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }

}
public class MyLinedList {
    public Node head;
    public MyLinedList(){
        this.head = null;
    }
    //判断是否为空

    //头插法
    public void addFirst(int data){
     Node node = new Node(data);
        //判断是否为空
     if(this.head == null) {
         this.head = node;
         return;
     }
     node.next = this.head;
     this.head = node;


    }
    //尾插法
    public void addLast(int data){
        //判断为空
        Node node = new Node(data);
        if(this.head==null) {
            this.head = node;
            return;
        }
        Node cur  = this.head;
        while(cur.next!=null) {
            cur = cur.next;
        }
        cur.next = node;


    }
    //找前驱
    public Node  findIndex(int index){
        int count = 0;
        Node cur = this.head;
        while(count<index-1) {
            cur = cur.next;
            count++;
        }
        return  cur;

    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index<0||index>size()) {
            throw new RuntimeException("index位置不合法");
        }
        if(index==0) {
            addFirst(data);
        }
        if(index==size()) {
            addLast(data);
        }
        Node node = new Node(data);
        node.next = findIndex(index).next;
        findIndex(index).next = node;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while(cur!=null) {
            if(cur.data==key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //找需要删除关键字节点的前驱
    public Node findprev(int key){
        Node prev = this.head;
        while(prev.next!=null) {
            if(prev.next.data==key) {
            return prev;
        }
            prev = prev.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head.data==key) {
            this.head=this.head.next;
        }
        if(findprev(key)==null) {
            System.out.println("没有找到这个节点");
        }
        findprev(key).next = findprev(key).next.next;

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur!=null) {
            if(cur.data==key) {
                prev.next = cur.next;
                cur = cur.next;
            }
            else{
                prev = prev.next;
                cur = cur.next;
            }
            if(this.head.data==key) {
                this.head = this.head.next;
            }
        }

    }
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count=0;
        while (cur!=null) {
            cur = cur.next;
            count++;

        }
        return count;
    }

    public void display(){
        Node cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }

    }
    public void clear(){

    }

}



