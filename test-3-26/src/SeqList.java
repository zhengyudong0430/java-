/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-03-26
 * Time: 15:21
 */
public class SeqList {
    public int []elem;
    public int usedSize;
    public static  final int  DEFAULT_SIZE= 10;
    public SeqList(){
        this.elem = new int [DEFAULT_SIZE];
        this.usedSize = 0;
    }
    //判空
    public  boolean isEmpty(){
        if(this.usedSize==0) {
            return true;
        }
        return false;
    }
    //判满
    public boolean isFull(){
        if(this.usedSize==this.elem.length) {
            return true;
        }
        return false;
    }
    // 打印顺序表
    public void display() {
        for(int i = 0;i<this.usedSize;i++) {
            System.out.print(this.elem[i]+" ");
        }
    }
    // 在 pos 位置新增元素
         public void add(int pos, int data) {
        if(isFull()) {
            System.out.println("顺序表是满的");
        }
        for(int i = this.usedSize-1;i>=pos;i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
         }
     // 判定是否包含某个元素
       public boolean contains(int toFind) {
        for(int i = 0;i<this.elem.length;i++) {
            if(this.elem[i]==toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
         public int search(int toFind) {
             if (isEmpty()) {
                 System.out.println("顺序表为空");
             }
             for (int i = 0; i < this.elem.length; i++) {
                 if (this.elem[i] == toFind) {
                     return i;
                 }
             }
             return 0;
         }

     // 获取 pos 位置的元素
         public int getPos(int  pos) {
        if(pos<0||pos>this.usedSize) {
            System.out.println("pos位置不合法");
        }

        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
         public void setPos(int pos, int value) {

    }
    //删除第一次出现的关键字key
       public void remove(int toRemove) {
         int j=search(toRemove);
        for(int i=0;i<this.usedSize-1;i++) {
            this.elem[j]=this.elem[j+1];
            j++;
        }
        this.usedSize--;

       }
    // 获取顺序表长度
         public int size() {
        return this.usedSize;
    }
    // 清空顺序表
         public void clear(){
          this.usedSize=0;
         }

   }
