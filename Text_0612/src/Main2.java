import java.util.Scanner;

public class Main2 {
    static int[] a =new int[10];
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i =0;i<str.length();i++){
            a[str.charAt(i)-48]++;
            System.out.println(a);
        }


        for(int i = 0;i<a.length;i++){
            if(a[i]!=0){
                System.out.println(i+":"+a[i]);
            }
        }
    }
}
