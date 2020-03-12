package Test;
//写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
//递归求斐波那契数列的第 N 项
import java.util.Scanner;
/*public class Zheng {
     public static void print (int n) {
         if(n>9) {
             System.out.println(n%10);
             n/=10;
         }

     }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        print(n);
    }
}*//*public class Zheng {
    public static int fabo(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fabo(n - 1) + fabo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fabo(n));
    }
}*//*
public class Zheng {
    public static int print(int n) {
        if(n<=9) {
            return n;
        }
        else {
           return (n%10)+ print(n/10);
        }

    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);
        int n = scan.nextInt();
        System.out.println(print(n));
    }
}*///按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归
/*public class Zheng {
    public static void print(int n) {


        if(n>9) {
            print (n/10);
        }
        System.out.println(n%10);

    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        print (n);
    }
}*/
public class Zheng {
    public static  int addSum (int n) {
        if(n==1) {
            return 1;
        }
        else {
            return n+addSum(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt(0);
        System.out.println(addSum(n));
    }
}