import java.util.*;

public class Printer1 {
    public static  int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int []arr = new int[m*n];
        for(int i = 0; i<n; i++) {
            System.out.println(mat[0][n]);
            int a = i;
            if(a==(n-1)) {
                for(int j = 0; j<m; j++) {
                    System.out.println(mat[j][a]);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int mat[][] = {{1,2,3},{4,5,6}};
        

    }
}