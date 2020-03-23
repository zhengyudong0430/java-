public class SeqList {
    public int[] elem;
    public int usedSize;
    public static final int DEFAULT_SIZE = 10;

    public SeqList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }

    //判满
    public boolean isFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }
    //判空
    public boolean  empty(){
        if(this.usedSize==0) {
            return false;
        }
        return true;
    }

    // 打印顺序表    
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 在 pos 位置新增元素    
    public void add(int pos, int data) {
        if (isFull()) {
            return;
        }
        if (pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return;
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    // 判定是否包含某个元素    
    public boolean contains(int toFind) {
        if (empty()) {
            System.out.println("顺序表是空的");
        }
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }


    // 查找某个元素对应的位置    
    public int search(int toFind) {
        for(int i=0;i<this.usedSize;i++) {
            if(toFind==this.elem[i]) {
                return i;
            }
        }

        return-1;
    }
    // 获取 pos 位置的元素    
    public int getPos(int pos) {
        for(int i=0;i<this.usedSize;i++) {
            if(pos==i) {
                return this.elem[i];
            }
        }
        return-1;
    }
    // 给 pos 位置的元素设为 value    
    public void  setPos(int pos, int value) {
        if(value>=0&&pos<this.elem.length) {
            this.elem[pos] = value;
        }
    }
    //删除第一次出现的关键字key    
    public void remove(int key) {
        for(int i=search(key);i<this.usedSize;i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度  
    public int size() {
        return this.usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize=0;
    }
}
