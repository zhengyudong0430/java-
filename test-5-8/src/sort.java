import java.util.Arrays;
import java.util.jar.JarOutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-05-08
 * Time: 14:47
 */
public class sort {

   public static void insertSort(int[] array) {
       for(int bound = 1;bound <array.length;bound++) {
           int tmp = array[bound];
           int cur = bound-1;
           for(;cur>=0;cur--) {
               if(array[cur]>tmp) {
                   array[cur+1] = array[cur];
               }
               else {
                   break;
               }
           }
           array[cur+1] = tmp;

       }
   }
   public static void shellSort(int []array){
       int gap = array.length/2;
       while(gap>1) {
           Sortgap(array,gap);
           gap/=2;
       }
       Sortgap(array,1);
   }

    private static void Sortgap(int[] array, int gap) {
       for(int bound = gap;bound<array.length;bound++) {
           int tmp = array[bound];
           int cur = bound - gap;
           for(;cur>=0;cur--) {
               if(array[cur]>tmp) {
                   array[cur+gap] = array[cur];
               }
               else{
                   break;
               }
           }
           array[cur+gap] = tmp;
       }
    }
public static void selectSort(int []array) {
       for(int bound = 0;bound<array.length;bound++) {
           for(int cur = bound;cur<array.length;cur++) {
               if(array[cur]<array[bound]) {
                   Swap(array,cur,bound);
               }
           }
       }
}

    private static void Swap(int[] array, int cur, int bound) {
       int tmp = array[cur];
       array[cur] = array[bound];
       array[bound] = tmp;
    }
    public static void heapSort(int[] array) {
        // 1. 先建立堆
        createHeap(array);
        int heapSize = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            // 2. 交换堆顶元素和堆中的最后一个元素
            Swap(array, 0 , heapSize - 1);
            // 3. 把最后一个元素从堆中删除掉
            heapSize--;
            // 4. 针对当前的堆从 根节点 开始进行向下调整
            shiftDown(array, heapSize, 0);
        }
    }

    private static void createHeap(int[] array) {
        // 从最后一个非叶子节点出发, 从后往前遍历, 依次进行向下调整
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--) {
            shiftDown(array, array.length, i);
        }
    }

    private static void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            // 当前是建立大堆. 找出左右子树中的较大值, 然后再和根节点比较.
            if (child + 1 < size && array[child + 1] > array[child]) {
                child = child + 1;
            }
            // 经历这个条件之后, child 是左子树还是右子树, 已经不知道了. 但是child 一定是指向
            // 左右子树的较大值.
            if (array[child] > array[parent]) {
                Swap(array, child, parent);
            } else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }

    public static void bubbleSort(int []array) {
       for(int bound = 0;bound<array.length;bound++) {
           for(int cur = array.length-1;cur>bound;cur--) {
               if(array[cur-1]>array[cur]) {
                   Swap(array,cur-1,cur);
               }
           }
       }
 }
 public static void quickSort(int []array) {
       quickSortHelper(array,0,array.length-1);
 }

    private static void quickSortHelper(int[] array,int left,int right) {
       if(left>=right) {
           return;
       }
       int index = parition(array,left,right);
       quickSortHelper(array,left,index-1);
       quickSortHelper(array,index+1,right);

    }

    private static int parition(int[] array, int left, int right) {
       int basevalue = array[right];
       int i=left;
       int j=right;
       while(i<j) {
           while (i<j&&array[i]<basevalue) {
               i++;
           }
           while(i<j&&array[j]>basevalue) {
               j--;
           }
           if(i<j) {
               Swap(array,i,j);
           }
       }
        Swap(array, i, right);
        return i;
    }

    public static void main(String[] args) {
        int []array = {5,2,7,3,9,8,1,6};
        insertSort(array);
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
        selectSort(array);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));

    }

}
