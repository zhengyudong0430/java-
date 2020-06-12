import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

        System.out.println(fac(n));
    }

    private static long fac(int n) {
        if(n == 0) {
            return 0;
        }
        else if(n ==1) {
            return 1;
        }else{
            return fac(n-1)+fac(n-2);
        }
    }
}
