import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int T = scanner.nextInt();
            while (T!=0) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int []arr = new int[2*n];
                for(int i = 0; i<2*n; i++) {
                    int tmp = i;
                    for(int j = 0; j<k; j++) {
                        if(tmp<n) {
                            tmp = 2*tmp;
                        }else{
                            tmp = 2*(tmp-n)+1;
                        }
                    }
                    //System.out.println(tmp);
                    arr[tmp] = scanner.nextInt();
                }

                for(int i = 0; i<2*n; i++) {
                    if(i == 2*n-1) {
                        System.out.print(arr[i]);
                    }else{
                        System.out.print(arr[i]+" ");
                    }
                }
                System.out.println();
                T--;
            }
        }
    }
}
