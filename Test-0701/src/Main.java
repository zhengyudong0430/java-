import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = n*n;
            int sum = 0;
            int sum1 = 0;
            while (n>0) {
                sum += n%10;
                n = n/10;
            }

            while (m>0) {
                sum1 += m%10;
                m = m/10;
            }
            System.out.println(sum+" "+sum1);
        }

    }


}
