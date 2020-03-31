/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-03-30
 * Time: 17:58
 */
public class testDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.getHead().setPrev(null);
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(4);
        doubleLinkedList.addLast(4);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(1);

        //doubleLinkedList.addIndex(1,110);
        //doubleLinkedList.addIndex(7,110);
        //doubleLinkedList.remove(18);
        //doubleLinkedList.removeAllKey(110);
        System.out.println(doubleLinkedList.size());
        doubleLinkedList.display();
        doubleLinkedList.clear();
        doubleLinkedList.display();
    }
}
