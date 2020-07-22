
import java.util.*;

public class Printer {
    public int[] arrayPrint(int[][] arr, int n) {
        // write code here
        //   if(n<1) return -1;
        //打印上三角包括中间00-nn的对角线
        int [] out=new int[n*n];
        int index=0;
        for(int j=n-1;j>=0;j--){
            int k=j;
            for(int i=0;i<n-j;i++){
                out[index++]=arr[i][k++];
            }
        }
        //打印剩下的下三角
        for(int i=1;i<n;i++){
            int k=i;
            for(int j=0;j<n-i;j++){
                out[index++]=arr[k++][j];
            }
        }
        return out;
    }
}