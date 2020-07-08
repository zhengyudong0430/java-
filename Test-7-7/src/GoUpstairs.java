import java.util.*;
public class GoUpstairs {
    public static int countWays(int n) {
        // wri
        // te code here
        if(n==1) {
            return 1;
        }else if(n==2) {
            return 2;
        }else if(n==3) {
            return 4;
        }
        else {
           int first = 1;
           int second = 2;
           int third = 4;
           int res = 0;
           while(n-3>0) {
               res = ((first+second)%1000000007+third%1000000007)%1000000007;
               first = second;
               second = third;
               third = res;
               n--;
           }
           return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(countWays(5));
    }
}