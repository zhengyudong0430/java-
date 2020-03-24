class Node{
    public int data;
    public Node Next;
    public Node(int data) {
        this.data = data;
        this.Next = null;
    }
}
public class SingleLinkedList {
    public Node head;
    public SingleLinkedList(){
        this.head = null;
    }
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head==null) {
            this.head=node;
            return;
        }
        node.Next = this.head;
        this.head = node;

    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head==null) {
            this.head=node;
            return;
        }
        Node cur = this.head;
        while(cur.Next!=null) {
            cur = cur.Next;
        }
        cur.Next = node;
    }
    //走index-1步
    private Node FindIndex(int index) {
        Node cur = this.head;
        int count = 0;
        while(count<index-1) {
            cur=cur.Next;
            count++;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
       if(index<0||index>size()) {
           throw new RuntimeException("index位置不合法");
       }
       if(index==0) {
           addLast(data);
       }
       if(index==size()) {
           addLast(data);
       }
       Node prev = FindIndex(index);
       Node node = new Node(data);
       node.Next = prev.Next;
       prev.Next = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while(cur!=null) {
            if(cur.data==key) {
                return true;
            }
            cur = cur.Next;
        }
        return false;
    }
    //找到要删除节点的前驱
    private Node FindPrev(int key){
        Node prev = this.head;
        while(prev.Next!=null) {
           if(prev.Next.data==key) {
               return prev;
           }
         prev = prev.Next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head.data==key) {
            this.head.Next=this.head;
            return;
        }
        Node prev = FindPrev(key);
        if(prev==null) {
            System.out.println("没有找到这个节点");
            return;
        }
        Node del = prev.Next;
        prev.Next = del.Next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node prev = this.head;
        Node cur = this.head.Next;
        while(cur!=null) {
            if(cur.data==key) {
                prev.Next = cur.Next;
                cur = cur.Next;
            }
            else {
                prev = prev.Next;
                cur = cur.Next;
            }
        }
         if(this.head.data==key) {
             this.head = this.head.Next;
         }

    }
    //得到单链表的长度
    public int   size(){
        Node cur = this.head;
        int count = 0;
        while(cur!=null) {
            cur = cur.Next;
            count++;
        }
        return  count;
    }

    public void display(){
        Node cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur = cur.Next;
        }
        System.out.println();

    }
    public void clear(){

    }

}
