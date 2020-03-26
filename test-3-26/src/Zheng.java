/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-03-26
 * Time: 15:21
 */
public class Zheng {
    public static void main(String[] args) {
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.display();
        System.out.println();
        System.out.println(seqList.contains(5));
        System.out.println(seqList.search(1));
        System.out.println(seqList.getPos(0));
        seqList.remove(1);
        seqList.display();
    }
}
