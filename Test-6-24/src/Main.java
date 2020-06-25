import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(getTotalCount(n));
        }
    }
    private static int getTotalCount(int n) {
        if(n==1||n==2) {
            return 1;
        }else{
          return   getTotalCount(n-1)+getTotalCount(n-2);
        }
    }
}
