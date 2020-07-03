import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
          long a = scanner.nextInt();
          long b = a*a;
          String s = a+"";
          String s1 =b+"";
          char []a1 = s.toCharArray();
          char []a2 = s1.toCharArray();
          int count = 0;
          for(int i = 1; i<a2.length; i++ ) {
              if(a2[i]==a1[i-1]) {
                  count++;
              }
          }
          if(count==a1.length) {
              System.out.println("Yes!");
          }else {
              System.out.println("No!");
          }
        }
        }
    }

