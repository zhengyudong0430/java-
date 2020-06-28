import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int []arr = new int[n];
            for(int i = 0; i<n; i++) {
                arr[i] = scanner.nextInt();
                if(a>=arr[i]) {
                    a+=arr[i];
                }else{
                    a+=gongyueshu(arr[i],a);
                }
            }
            System.out.println(a);
        }

    }

    private static int gongyueshu(int i, int j) {
        int k = 0;
        while (i%j!=0) {
            k = i%j;
            i = j;
            j = k;
        }
        return j;
    }
}
