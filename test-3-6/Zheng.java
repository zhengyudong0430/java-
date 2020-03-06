//输出 1000 - 2000 之间所有的闰年
/*public  class Zheng {
	 public static void main(String[] args) {
		int year=1000;
		for(year=1000;year<=2000;year++) 
		{sc
         if((year%4==0&&year%100!=0)||(year%400==0))
         	System.out.print(year+" ");

		}

	}
}*//*
import java.util.Scanner;
public class Zheng { 
 public  static  void main (String[]args) {
 	//Scanner scan =new Scanner(System.in);
    // int n = scan.nextInt();
     boolean isprime=true;
     int i=2;
     int x=1;
     /*if ( n <=2)
    {
	isprime = false;
    }*//*
    for(x=1;x<=100;x++) 
    {
     for(i=2;i<=x-1;i++)
     {
     	if(x%i==0)
     	{
     		isprime=false;
     		break;
     	}
     }
 
 if (isprime)
{
	System.out.println(x+" ");
	
}
}
/*else
{
	System.out.println(n+ "不是素数");
}*/
 //}
//}s
public class Zheng{
   public static void main(String[] args){
       
    for(int i=1;i<=100;i++){
			int count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(i+" ");
			}
		}
   }
}

