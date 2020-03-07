//根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)

/*import java.util.Scanner;
public class Zheng {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int oldYear=scan.nextInt();
		if(oldYear<=18) {
			System.out.println("是少年");
		}
		if(oldYear>=19&&oldYear<=28) {
			System.out.println("是青年");
		}
		if(oldYear>=29&&oldYear<=55) {
			System.out.println("是中年");
		}
		if(oldYear>=56) {
			System.out.println("是老年");
		}
	}
}*///计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 
//编写程序数一下 1到 100 的所有整数中出现多少个数字9
/*public class Zheng  {
	public static void main(String[] args) {
		int i=1;
		int count=0;
		for(i=1;i<=100;i++) {
			if(i%10==9) {
				count++;
			}
			if(i/10==9) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}*///完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
/*import java.util.Random;
import java.util.Scanner;
public class Zheng {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int rand = random.nextInt(100);
		while(true) {
			System.out.println("请输入一个数字：");
			int num = scan.nextInt();
			if(num>rand) {
				System.out.println("你猜的大了");
			}
				else if(num==rand) {
					System.out.println("猜对了");
				}
					else{
						System.out.println("猜小了");
					}
				}

	}
}*/
//求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
/*public  class Zheng {
public static void main(String[] args) {
		for (int i = 0;i <= 9999 ; i++) {
			int count = 0;
			int tmp = i;
			while (tmp != 0) {
				count++;
				tmp = tmp/10;
			}
			tmp = i;
			int sum = 0;
			while (tmp != 0) {
				sum += Math.pow(tmp%10,count);
				tmp = tmp/10;
			}
			if(sum == i) {
				System.out.println(sum);
			}
			
		}

	}
}*/
//求两个正整数的最大公约数
import java.util.Scanner;
/*public class Zheng {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a%b;
		while(c!=0) {
			a=b;
			b=c;
			c=a%b;


		}
System.out.println(b);
	}
}*///求一个整数，在内存当中存储时，二进制1的个数。
public class Zheng {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//-1
		int count = 0;
		while(n != 0) {
			if((n & 1) != 0 ){
				count++;
			}
			n = n>>>1;//针对负数  
		}
		System.out.println("1的个数："+count);
	}

}