import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int []arr =  new int[N];
            for(int i = 0; i<N; i++) {
                arr[i] = scanner.nextInt();
            }
            for(int i = 0; i<M; i++) {
               String c = scanner.next();
               int a = scanner.nextInt();
               int b = scanner.nextInt();
               if(c.equals("Q")) {
                   int s = Math.min(a,b);
                   int e = Math.max(a,b);
                   int max = arr[s-1];
                   for(int j = s-1; j<e; j++ ) {
                       if(arr[j]>max) {
                           max = arr[j];
                       }

                   }
                   System.out.println(max);
               }if(c.equals("U"))
               {
                   arr[a-1] = b;
               }
            }
        }
    }
}
