package text_0601;
import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int k) {
        // write code here
        if(a ==null||k<=0||k>=n) {
            return -1;
        }
        quicksort(a,0,n-1);
        List<Integer>  list = new ArrayList<Integer>();
        for(int i = 0;i<n; i++) {
            if(!list.contains(a[i])) {
                list.add(a[i]);
            }
        }
        int ret = list.size();
        return list.get(ret-k);
    }

    private void quicksort(int[] a, int left, int right) {
        if(left>=right) {
            return;
        }
        int index = partition(a,left,right);
        quicksort(a,left,index-1);
        quicksort(a,index+1,right);
    }

    private int partition(int[] a, int left, int right) {
        int basevalue = a[right];
        int i = left;
        int j = right;
        while(i<j) {
            while(i<j&&a[i]<=basevalue) {
                i++;
            }
            while (i<j&&a[j]>=basevalue) {
                j--;
            }
            if(i<j) {
                swap(a,i,j);
            }
        }
        swap(a,i,right);
        return i;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}