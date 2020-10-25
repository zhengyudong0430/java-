
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int m = scanner.nextInt();
            int n;
            n = fun(m);
            System.out.println(n);
        }
    }

    private static int fun(int i) {
    if(i==5) {
        return 6;
    }else {
        return fun(i+1)*5+1;
    }
    }
}
