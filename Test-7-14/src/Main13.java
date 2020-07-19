import java.util.Scanner;
public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int []arr = new int[n];
            for (int i = 0; i<n; i++) {
                arr[i] = scanner.nextInt();
            }
            int max = arr[0];
            int sum = arr[0];
            for(int i = 1; i<n; i++) {
                if(sum>=0) {
                    sum+=arr[i];
                }else {
                    sum = arr[i];
                }
                if(sum>max) {
                    max = sum;
                }
            }
            System.out.println(max);
        }
    }
}
