import java.util.Scanner;
public class Main23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String str = "";
            int []num = new int[n];
            int j = 1;
            for (int i = 0; i<n; i++) {
                num[i] =  j++;
            }
            int sum = 0;
            process(num,str,sum,m,0);
        }
        }

    private static void process(int[] num, String str, int sum, int m, int i) {
        if(i==num.length) {
            if(sum==m) {
                System.out.print(str.trim());}
                return;
        }
        process(num,str+num[i]+" ",sum+num[i],m,i+1);
        process(num,str,sum,m,i+1);
    }
}
