package Test;
//写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
import java.util.Scanner;
public class Zheng {
    public static void main(String[]args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
       /*while (n!=0)
        {
            if (n % 2 == 1)
            {
                count++;
            }
            n = n / 2;
        }*/
      /* int i = 0;
       for(i=0;i<32;i++) {
           if((n&1)==1) {
               count++;
           }
           n>>=1;
       }*/
      while(n!=0) {
          count++;
          n=n&(n-1);
      }
     System.out.println("count是"+count);
    }
}
