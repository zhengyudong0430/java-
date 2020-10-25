import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int n = in.nextInt();
            int cnt = 0;
            while (n>=cnt+1) {
                    cnt++;
                    n-=cnt;
            }
            System.out.println(cnt);
        }
    }
}
