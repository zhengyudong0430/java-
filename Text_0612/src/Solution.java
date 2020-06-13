
import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        if(A == null || A.length == 0) return A;
        int[]  res = new int[A.length];
        res[0] = 1;
        for(int i = 1;i < A.length;i++){
            //纪录每个数左边的积
            res[i] = A[i-1]*res[i-1];
        }
        int tmp = 1;
        for(int i = A.length - 2;i >= 0;i--){
            //纪录每个数右边的积
            tmp *= A[i + 1];
            res[i] *=tmp;
        }
        return res;
    }
}
