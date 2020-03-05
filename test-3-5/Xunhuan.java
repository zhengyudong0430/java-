import java.util.Scanner;
//输出 1000 - 2000 之间所有的闰
//打印 1 - 100 之间所有的素数
/*public class Xunhuan {
public static void main(String[] args) {
		int year=1000;
      for(year=1000;year<=2000;year++) {
      	if ((year%4==0&&year%100!=0)||(year%400==0))
      		System.out.print(year+" ");
      }
     }
       
    }*/
    public class Xunhuan {

public static void main(String[]args) {
	Scanner scan =new Scanner(System.in);
	   int n=scan.nextInt();
	   int i=2;
	   for(i=2;i<=n-1;i++) { 
         if(n%i==0)
          System.out.println(n+"不是素数");
           break;
          
	   }
  System.out.println(n+"是素数");
          
  }
}