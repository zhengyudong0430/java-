public class Zheng {
    public static void main(String[] args) {
        MyLinedList  myLinedList = new MyLinedList();
        myLinedList.addFirst(1);
        myLinedList.addFirst(2);
        myLinedList.addFirst(3);
        myLinedList.display();
        System.out.println();
        myLinedList.addLast(1);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.display();
        System.out.println();
        myLinedList.addIndex(3,0);
        myLinedList.display();
        System.out.println();
        System.out.println(myLinedList.contains(0));
        myLinedList.remove(0);
        myLinedList.display();
        System.out.println();
        myLinedList.removeAllKey(0);
        myLinedList.display();
    }
}
