import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        while(b<n){
            int tmp = a+b;
            a = b;
            b = tmp;
        }
        System.out.println((b-n)<(n-a)?(b-n):(n-a));
    }
}
