public class Zheng {
    /*public static void jiaohuan(Swap swap1,Swap swap2) {
        int tmp = swap1.getNum();
        swap1.setNum(swap2.getNum());
        swap2.setNum(tmp);
    }*/
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.display();
        singleLinkedList.addLast(3);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(1);
        singleLinkedList.display();
        singleLinkedList.addIndex(3,0);
        singleLinkedList.display();
        System.out.println(singleLinkedList.contains(0));
        singleLinkedList.remove(0);
        singleLinkedList.display();
        singleLinkedList.removeAllKey(3);
        singleLinkedList.display();
        /*Swap swap1=new Swap();
        swap1.setNum(10);
        Swap swap2=new Swap();
        swap2.setNum(20);
        System.out.println(swap1.getNum()+" "+swap2.getNum());
        jiaohuan(swap1,swap2);
        System.out.println(swap1.getNum()+" "+swap2.getNum());*/
    }
}
