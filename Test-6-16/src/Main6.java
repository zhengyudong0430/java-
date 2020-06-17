
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if(n==1) {
                System.out.println("1");
            }
            else{
                for(int i = 0; i<n; i++) {
                    int base = n*(n-1);
                    if(i!=n-1) {
                        System.out.print((base+2*i+1)+"+");
                    }else{
                        System.out.print(base+2*i+1);
                    }
                }
            }
            System.out.println();
        }

    }


}
