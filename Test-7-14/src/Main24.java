import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String res = "";
            int sum = 0;
            int num[] = new int[n];
            int j = 1;
            for(int i = 0; i<n; i++) {
                num[i] = j++;
            }
            process(num,sum,m,res,0);
        }
    }

    private static void process(int[] num, int sum, int m, String res, int i) {
        if(i==num.length) {
            if(sum==m) {
                System.out.println(res.trim());
            }
            return;
        }
        process(num,sum+num[i],m,res+num[i]+" ",i+1);
        process(num,sum,m,res,i+1);
    }
}
