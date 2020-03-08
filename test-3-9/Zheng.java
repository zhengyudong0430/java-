/*public class Zheng {
	public static void main(String[] args) {
        
        int[] num = new int[]{1,9,9,5,4,5,4,1,3,7,3};
        System.out.println(findNumber(num));
    }
    public static int findNumber(int[] num){
        
        int n = 0;
        for(int i = 0;i<num.length;i++){
            n ^= num[i];
        }
        return n;
    }

} *///求斐波那契数列的第n项。(迭代实现)
import java.util.Scanner;
/*
public class Zheng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = fabonacci(n);
        System.out.println(ret);
    }
    public  static int fabonacci(int n) {
        if(n<=2) {
            return 1;
        }
        else {
            int tmp = fabonacci(n-1)+fabonacci(n-2);
            return tmp;
        }
    }
}*///求 N 的阶乘 。
/*public class Zheng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = fac(n);
        System.out.println(ret);
    }
    public static int fac(int n) {
        if(n==1) {
            return 1;
        }
        else {
            int tmp = n*fac(n-1);
            return tmp;
        }
    }
}*/
//求1！+2！+3！+4！+........+n!的和
/*public class Zheng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         int add=facadd(n);
         System.out.println(add);
    }
    public static int facadd(int n) {
        int sum=0;
        for(int i=1;i<=n;i++) {
            int ret=1;      
        for(int j=1;j<=i;j++) {
              ret*=j;
            }
            sum+=ret;
        }
        return sum;
    }
}*/
//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序
/*import java.lang.String ;
public class Zheng {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,5,6};
        order(arr);
        for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i]);
        
}
    }
    public static void order(int[]arr) {
        int left = 0;

        int right =arr.length-1;
        while (left < right)
            {
while ((left < right) && (arr[left] % 2 == 1))
{
left++;//是奇数时，数组向右继续
}
while ((left < right) && (arr[right] % 2 == 0))
{
right--;//是偶数时，数组向左继续
}
if (left < right)
{
int tmp = arr[left];//当奇数在右边，偶数在左边，完成交换
arr[left] = arr[right];
arr[right] = tmp;
}
     
}

}
}
创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。

​// 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算

public class Zheng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int ret = max3(i,j,k);
        System.out.println(ret);
    }
        public static int max2(int i,int j) {
        return i >= j ? i : j;
    }

    public static int max3(int i,int j,int k) {
        return max2(max2(i,j),k);
    }
    
}
*///
//在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
/*public class Zheng  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("两个整数中最大的是："+max(a,b));
        double i = scan.nextDouble();
        double j = scan.nextDouble();
        System.out.println("两个小数中最大的是："+max(i,j));
        double  x = scan.nextDouble();
        double y = scan.nextDouble();
        int k = scan.nextInt(); 
        System.out.println("两个小数和一个整数中最大的是："+max(i,j,k));

            }
    public static int max(int a,int b) {
        return a>b?a:b;
    }
    public static double max(double i,double j) {
        return i>j?i:j;
    }
    public static double max (double i,double j,int k) {
        return max(max(i,j),k);
    }
}*///在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果


public class Zheng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("两个整数的和是"+add(a,b));
        double i = scan.nextDouble();
        double j = scan.nextDouble();
        double k = scan.nextDouble();
        System.out.println("三个小数的和是"+add(i,j,k));
    }
    public static int add(int a,int b) {
        return a+b;
    }
    public static double add(double i,double j,double k) {
        return i+j+k;
    }
}