import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String  a = scanner.next();
            String  []s = a.split("\\.");
            String b = scanner.next();
            String []s1 = b.split("\\.");
            int  n = Integer.parseInt(s[0])*17*29+Integer.parseInt(s[1])*29+Integer.parseInt(s[2]);
            int m = Integer.parseInt(s1[0])*17*29+Integer.parseInt(s1[1])*29+Integer.parseInt(s1[2]);
            int k = 0;
            if(n>m) {
                System.out.println("-");

            }else{
                 k = m-n;
            }
            if(k==0) {
                System.out.print(0+".");
                System.out.print(0+".");
                System.out.println(0);
            }
            System.out.print(k/(17*29)+".");
            if(k/(17*29)==0) {
                System.out.print(0+".");
                System.out.print(0);
            }
            k=k%(17*29);
            System.out.println(k/29);
            if(k/29==0) {
                System.out.print(0+".");
            }
            k=k%29;
            System.out.println(k);;
    }}
}
