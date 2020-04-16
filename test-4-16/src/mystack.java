/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-16e
 * Time: 14:15
 */
public class mystack {
    private int []arr = new int[10];
    private int size = 0;
    public void push(int value) {
        arr[size] = value;
        size++;
    }
    public Integer pop() {
        if(size<=0) {
            return null;
        }
        int ret = arr[size-1];
        size--;
        return ret;
    }
    public Integer peek(){
        if(size<=0) {
            return null;
        }
        int ret = arr[size-1];
        return ret;
    }
    public static void main(String[] args) {
        mystack stack = new mystack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while(true) {
            Integer cur = stack.pop();
            if(cur==null) {
                break;
            }
            System.out.println(cur);

        }

    }
}
