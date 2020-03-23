public class Zheng {
    public static void swap( Swap swap1,Swap swap2) {
        int tmp=swap1.num;
        swap1.num=swap2.num;
        swap2.num=tmp;
}
            public static void main (String[]args){
                Swap swap1 = new Swap();
                swap1.num = 10;
                Swap swap2 = new Swap();
                swap2.num = 20;
                System.out.println(swap1.num + " " + swap2.num);
                swap(swap1, swap2);
                System.out.println(swap1.num + " " + swap2.num);
        /*SeqList seqList=new SeqList();
        seqList.add(0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.add(3,40);
        seqList.display();
        System.out.println(seqList.contains(15));
        System.out.println(seqList.search(20));
        System.out.println(seqList.getPos(0));
        seqList.setPos(2,99);
        seqList.display();
        seqList.remove(10);
        seqList.display();
        System.out.println(seqList.size());
        System.out.println("================");
        seqList.clear();
        System.out.println(seqList.size());*/
            }
        }