/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-03-22
 * Time: 16:05
 */

public class MyArrayList {
    public int[] elem;//null
    public int usedSize;//0

    //设置默认容量
    public static final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }
}
    public void add (int pos,int data) {
        if(isFull()) {
            System.out.println("满");
            return;
        }
        int i = this.usedSize-1;
        for( i = this.usedSize-1;i>=pos;i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[i+1] = data;
    }
    public int contains(int toFind) {
        if(isEmpty()) {
            for(int i=0;i<usedSize;i++) {
                if(this.elem[i]==toFind) {
                    System.out.println("包含");
                }
                System.out.println("不包含");
            }
        }
    public int search(int toFind) {
            if(isEmpty()) {
                for(int i=0;i<usedSize;i++) {
                    if(this.elem[i]==toFind) {
                       return i;
                    }
                    System.out.println("没有找到");
                }
            }

        }
 public void remove (int key) {
            if(search(key)==-1) {
                System.out.println("不需要删除");
            }
            int index=search(key);
            for(int i=index;i<usedSize-1；i++) {
                this.elem[i]=this.elem[i+1];
            }
            this.usedSize=this.usedSize-1;


        }
    public boolean isEmpty(){
    if(this.usedSize != 0) {
        return true;
    }
    return false;
    }

    public boolean isFull() {
        if(this.usedSize == this.elem.length) {
        return true;
        }
        return false;
        }

}