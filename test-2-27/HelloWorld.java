public class HelloWorld{

 /* public static void main(String[]args){

     int i=3;
     int j=5;
     int tmp=i;
     i=j;
     j=tmp;
     System.out.println(i);
     System.out.println(j);
     }
*/
  /*
public static void main(String[]args){
   

    int i=3,j=5,k=6;
    int max=i;
    if(max<j)
    {
    	max=j;

    }
    if(max<k)
    {
    	max=k;
    }
    
    System.out.println(max);
    
      


}
*/

public static void main(String[]args){
  int i=10;
  int j=20;
  int k=30;
   int max=(i>j)? i:j;
   max=(max>k)? max:k;
   
   System.out.println(max);
}
}


