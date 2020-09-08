public class MergeSort {
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
    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
