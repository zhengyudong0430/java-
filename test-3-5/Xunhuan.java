//import.java,util.Scanner
//输出 1000 - 2000 之间所有的闰
public class Xunhuan {
public static void main(String[] args) {
		int year=1000;
      for(year=1000;year<=2000;year++) {
      	if ((year%4==0&&year%100!=0)||(year%400==0))
      		System.out.print(year+" ");
      }
     }
       
    }