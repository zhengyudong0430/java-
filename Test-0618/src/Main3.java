import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int []arr = new int[n];
            for(int i = 0; i<n; i++) {
                arr[i] = scanner.nextInt();
            }
            int score = scanner.nextInt();
            int count = 0;
            for(int i = 0; i<n; i++) {
                if(arr[i]==score) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
