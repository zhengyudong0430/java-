/*	public static int Max(int i,int j) {
	int sum = i>j?i:j;
	return sum;
}
     public static int Max1(int )
	public static void main(String[] args) {
		int i=3;
		int j=5;
		int k=9;
		
		System.out.println(Max(i,j,k));
	}
}
*/
/*public class Zheng {
	public static void main(String[] args) {
		int n=5;
		System.out.println(fac(n));
	}
	public static int fac(int n) {
		int ret=1;
		if(n==1)  {
			return 1;
		}
		else{
        
        ret= n*fac(n-1);

	}
	return ret;
}
}*///输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3

import java.util.Scanner;
 /*   public class Zheng {
	public static void   print  (int n) {
		if(n < 0) {
			System.out.println("-");
			n = -n;
		    }
		if(n>9) {
			print(n/10);
		}
		System.out.println(n%10);
	}
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    print(n);
}
}
*//*public class Zheng {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//123
		if(n < 0) {
			System.out.println("-");//递归
			n = -n;
		}
		while(n != 0) {
			int tmp = n % 10;//123%10=3   2   1
			System.out.println(tmp);//递归
			n = n/10;//n = 123/10=12   12/10 =1   1/10=0
		}

	}
}*/
//输出n*n的乘法口诀表，n由用户输入。
/*public class Zheng {
	public static void multiplicationTable(int n) {
		int i=1;
		int j=1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+j*i+" " );
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		multiplicationTable(n);
	}
}
public class Zheng {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int count=3;
		while(count!=0) {
			System.out.println("请输入密码：");
			String password = scan.next();
			if(password.equals("123")) {
				System.out.println("密码正确");
				break;
			}
			else {
				count--;
				System.out.println("请重新输入，你还有"+count+"机会");
			}
		}
	}
	
}*/
public class Zheng  {
	
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//-1

		for (int i = 31; i >= 1; i -= 2) {
			System.out.print (  ((n >>> i) & 1) + " "  );
		}

		System.out.println();

		for (int i = 30; i >= 0; i -= 2) {
			System.out.print (  ((n >>> i) & 1) + " "  );
		}

	}
	}
	
