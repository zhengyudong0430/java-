import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main10 {
public static long num ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        long N = scanner.nextLong();
        long []arr = new long[(int) N];
        for(int i = 0; i<N; i++) {
            arr[i] = scanner.nextInt();
        }
            if(N==1) {
                System.out.println(arr[0]);
                return;
            }
            List<Integer> list = new ArrayList<>();
        for(long i = 0; i<N; i++) {
           list.add((int) sum(i,arr));

        }
            Collections.sort(list);
            System.out.println(list.get(list.size()-1));
        }
        }

    private static long sum(long i, long[] arr) {
        long max = arr[(int) i];
        for(long j = i; j<arr.length-1; j++) {
            if(arr[(int) (j+1)]>=0) {
                max+=arr[(int) (j+1)];
            }else {
                return max;
            }
        }
        return max;
    }
}

