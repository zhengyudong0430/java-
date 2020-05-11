import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-05-11
 * Time: 11:35
 */
public class Sort {
    public static void insertSort(int []array) {
        for(int bound=1;bound<array.length;bound++) {
            int tmp = array[bound];
            int cur = bound-1;
            for(;cur>=0;cur--) {
                if(array[cur]>tmp) {
                    Swap(array,cur,cur+1);
                }else{
                    break;
                }
            }
            array[cur+1] = tmp;
        }
    }

    private static void Swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

    }
   public static void shellSort(int []array) {
        int gap = array.length/2;
        while(gap>1) {
            SortGap(array,gap);
            gap/=2;
        }
        SortGap(array,1);
   }

    private static void SortGap(int[] array, int gap) {
        for(int bound = gap; bound<array.length; bound++) {
            int tmp = array[bound];
            int cur = bound - gap;
            for(;cur>=0;cur--) {
                if(array[cur]>tmp) {
                    Swap(array, cur, cur + gap);
                }else{
                    break;
                }
            }
            array[cur+gap] = tmp;
        }
    }
 public static void SelectSort(int []array) {
        for(int bound = 0;bound<array.length;bound++) {
            for(int cur = bound;cur<array.length;cur++) {
                if(array[cur]<array[bound]) {
                    Swap(array,cur,bound);
                }
            }
        }
 }
 public static void BubbleSort(int []array) {
        for(int bound=0;bound<array.length;bound++) {
            for (int cur = array.length-1; cur>bound; cur--) {
                if (array[cur-1]>array[cur]) {
                    Swap(array,cur-1,cur);
                }
            }
        }
 }
public static void QuickSort(int []array) {
        QuickSortHelper(array,0,array.length-1);
}

    private static void QuickSortHelper(int[] array, int left, int right ) {
        if(left>=right) {
            return;
        }
        int index = partition(array,left,right);
        QuickSortHelper(array,left,index-1);
        QuickSortHelper(array,index+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int basevalue = array[right];
        int i = left;
        int j = right;
        while (i<j) {
            while (i<j&&array[i]<basevalue) {
                i++;
            }
            while (i<j&&array[j]>basevalue) {
                j--;
            }
            if(i<j) {
                Swap(array,i,j);
            }
        }
        return i;

    }
    public static void HeapSort(int []array) {
        CreateHeap(array);
        int heapSize = array.length;
        for(int i = 0; i<array.length; i++) {
            Swap(array,0,heapSize-1);
            heapSize--;
        }
        shiftdown(array,heapSize,0);
    }

    private static void shiftdown(int[] array, int size, int index) {
        int parent = index;
        int child = 2*parent+1;
        while(child<size) {
            if(child+1<size&&array[child+1]>array[child]){
                child = child+1;
            }
            if(array[child]>array[parent]) {
                Swap(array,child,parent);
            }else{
                break;
            }
            parent = child;
            child = 2*parent+1;
        }

    }

    private static void CreateHeap(int[] array) {
        for(int i = array.length-1-1/2;i>=0;i--) {
            shiftdown(array,array.length,i);
        }

    }
    public static void mergeSort(int[] array) {
        // [0, length)
        mergeSortHelper(array, 0, array.length);
    }

    private static void mergeSortHelper(int[] array, int left, int right) {
        // [left, right)
        // if (left >= right) {
        if (right - left <= 1) {
            // 当前区间中有 0 个或者 1 个元素. 不需要进行排序
            return;
        }

        // 针对 [left, right) 区间, 分成对等的两个区间
        int mid = (left + right) / 2;
        // 两个区间分别就是
        // [left, mid)
        // [mid, right)
        mergeSortHelper(array, left, mid);
        mergeSortHelper(array, mid, right);
        // 通过上面的递归, 认为这两个区间都被排好序了. 接下来就可以进行合并了
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        // 当前有两个有序数组
        // [left, mid)
        // [mid, right)
        int cur1 = left;
        int cur2 = mid;
        // 临时空间需要能容纳下 两个数组合并后的结果
        int[] output = new int[right - left];
        int outputIndex = 0; // 当前 output 中被插入了几个元素.

        while (cur1 < mid && cur2 < right) {
            // 此处必须是 <= , 不能是 < .
            // 如果是 < 是无法保证稳定性的.
            if (array[cur1] <= array[cur2]) {
                // 把 cur1 位置的元素插入到 output 中
                output[outputIndex] = array[cur1];
                cur1++;
                outputIndex++;
            } else {
                output[outputIndex] = array[cur2];
                cur2++;
                outputIndex++;
            }
        }
        while (cur1 < mid) {
            output[outputIndex] = array[cur1];
            cur1++;
            outputIndex++;
        }
        while (cur2 < right) {
            output[outputIndex] = array[cur2];
            cur2++;
            outputIndex++;
        }
        // 最后一步要把数据从临时空间中拷贝回原来的数组中.
        for (int i = 0; i < right - left; i++) {
            array[left + i] = output[i];
        }
    }
    public static void main(String[] args) {
        int []array = {2,4,1,7,3,8,9,5,6};
        //insertSort(array);
        //System.out.println(Arrays.toString(array));
        //shellSort(array);
        //System.out.println(Arrays.toString(array));
        //SelectSort(array);
        //System.out.println(Arrays.toString(array));
        //BubbleSort(array);
        //QuickSort(array);
        //HeapSort(array);
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}

