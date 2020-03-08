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
public class Zheng {
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
}