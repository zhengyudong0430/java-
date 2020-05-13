import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-05-13
 * Time: 19:52
 */
public class Heap1 {
    public static void main(String[] args) {
        int []array = {3,2,5,1,9,7,0,6,4};
        CreateHeap(array,array.length);
        System.out.println(Arrays.toString(array));

    }

    private static void CreateHeap(int[] array, int size) {
    for(int i = size-1-1/2;i>=0;i--) {
        shiftDown(array,size,i);
    }
    }

    private static void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = parent*2+1;
        while(child<size) {
            if(child+1<size&&array[child+1]<array[child]) {
                child = child+1;
            }
            if(array[child]<array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
            }else{
                break;
            }
            parent = child;
            child = 2*parent+1;
        }
    }

}
