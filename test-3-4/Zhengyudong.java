/*public class Zhengyudong {

 

    public static void main(String[] args) {

       int sum=0;

        for (int i = 100; i < 200;i++) {

           if (IsRightNum(i)) { //判断这个数是不是素数

              System.out.print(i+"  ");

              sum++;

              if (sum%10==0) { //十个一行

                  System.out.println();

              }

           }

       }

        System.out.println("素数的整数："+sum);

        

    }

   

    //判断这个数是不是素数的具体代码

    private static boolean IsRightNum(int i) {

       for (intj = 2; j < Math.sqrt(i);j++) {

           if (i%j==0) { //如果能整除，就说明不是素数，可以马上中断，继续对下一个数判断

              return false;

           }

       }     

        

       return true;

    }

 

}
*//*
public class Zhengyudong {
 
  public static void main(String[]args) {
    System.out.println("你好");
  }


}*//*
public  class Zhengyudong {
  public static void main(String[]args) {
    int i=0;
    for(i=0;i<=10;i++)
    {
      System.out.print(i);
    }
  }
}*/
public  class Zhengyudong {
  public  static void main (String[]args) {
       int i =0;
       int j =0;
       for(i=1;i<=9;i++)
       {
        for( j=1;j<=i;j++) {
          System.out.print(i+"*"+j+"="+i*j+" ");
        }
        System.out.println();
       }

  }
}