import java.util.*;
public class Main9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        FindIndex(arr,n);
    }
    public static void FindIndex(int[] arr,int n){
        int[] a = new int[2];
        for(int i = 0;i < n;i++){
            if(i == 0){
                a[0] = -1;
            }
            if(i == n - 1){
                a[1] = -1;
            }
            int j = i;
            while(j >= 0 && j <= n - 1){
                j --;
                if(j >= 0) {
                    if (arr[i] > arr[j]) {
                        a[0] = j;
                        break;
                    }
                }
                else {
                    a[0] = -1;
                }
            }
            j = i;
            while(j >= 0 && j <=n - 1){
                j ++;
                if(j <= n - 1) {
                    if (arr[i] > arr[j]) {
                        a[1] = j;
                        break;
                    }
                }else {
                    a[1] = -1;
                }
            }
            System.out.println(a[0] + " " + a[1]);
        }
    }
}