package text_0601;

import java.util.*;

public class AntiOrder {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,0};
        int n = 8;
         int ret = count(array,n);
        System.out.println(ret);

    }
    public static int count(int[] A, int n) {
        // write code here
        int count  = 0;

        for(int i = 0;i<n; i++) {
            for( int j = i+1;j<n; j++) {
                if(A[i]>A[j]) {
                    count++;
                }
            }
        }
        return count;
    }


}