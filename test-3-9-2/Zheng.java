import java.util.Scanner;
public class Zheng {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		 oldYear(n);
	}
	public static void oldYear(int n) {
	       if(n<=18) {
		System.out.println(n+"岁是少年");
				}
			if(n>=19&&n<=25) {
		System.out.println(n+"岁是青年");
			}
			if(n>=25&&n<=55) {
		System.out.println(n+"岁是中年");
			}
			if(n>55) {
		System.out.println(n+"岁是老年");
			}
}
}