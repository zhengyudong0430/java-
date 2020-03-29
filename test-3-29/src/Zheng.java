/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-03-29
 * Time: 15:25
 */
public class Zheng {
    public static void main(String[] args) {
    DoubleLinkedList  doubleLinkedList =new  DoubleLinkedList();
    doubleLinkedList.addFirst(1);
    doubleLinkedList.addFirst(2);
    doubleLinkedList.addFirst(3);
        doubleLinkedList.display();
        System.out.println();
    doubleLinkedList.addLast(1);
    doubleLinkedList.addLast(2);
    doubleLinkedList.addLast(3);
        doubleLinkedList.display();
        System.out.println();
    doubleLinkedList.addIndex(3,0);
        doubleLinkedList.display();
        System.out.println();
    System.out.println(doubleLinkedList.contains(0));
    doubleLinkedList.remove(0);
        doubleLinkedList.display();
        System.out.println();
    doubleLinkedList.removeAllKey(1);
        doubleLinkedList.display();
        System.out.println();
        doubleLinkedList.clear();
        doubleLinkedList.display();
    }
}
