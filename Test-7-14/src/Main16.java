import java.util.Scanner;
public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
         findIndex(arr,n);
    }

    private static void findIndex(int[] arr, int n) {
        int res[] = new int[2];
        for(int i = 0; i<n; i++) {
            if(i==0) {
                res[0] = -1;
            }
            if(i==n-1) {
                res[1] = -1;
            }
            int j = i;
            while (j>=0&&j<=n-1) {
                j--;
                if(j>=0) {
                    if(arr[j]<arr[i]) {
                        res[0] = j;
                        break;
                    }
                }
                else {
                    res[0] = -1;
                }
            }
            j = i;
            while (j>=0&&j<=n-1) {
                j++;
                if(j<=n-1) {
                    if(arr[j]<arr[i]) {
                        res[1] = j;
                        break;
                    }
                }
                else {
                 res[1] = -1;
                }
            }
            System.out.println(res[0]+" "+res[1]);
        }
    }
}
