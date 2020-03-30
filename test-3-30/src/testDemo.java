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
        doubleLinkedList.addFirst(110);
        doubleLinkedList.addFirst(110);
        doubleLinkedList.addFirst(110);
        doubleLinkedList.addFirst(110);
        doubleLinkedList.addLast(110);
        doubleLinkedList.addIndex(1,110);
        //doubleLinkedList.addIndex(7,110);
        //doubleLinkedList.remove(18);
        doubleLinkedList.removeAllKey(110);
        System.out.println(doubleLinkedList.size());
        doubleLinkedList.display();
        doubleLinkedList.clear();
        doubleLinkedList.display();
    }
}
