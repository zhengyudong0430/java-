import sun.text.resources.es.FormatData_es_UY;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            float den = fac(n);
            System.out.println(den);
           float num = count(n);
            System.out.println(num);
            float res = num/den*100;
            System.out.println(String.format("%.2f",res)+"%");
        }
    }

    private static float count(int n) {
        if(n==1) {
            return 0;
        }
        else if(n==2) {
            return 1;
        }else{
            return (n-1)*(count(n-1)+count(n-2));
        }
    }

    private static float fac(int n) {
        if(n==1) {
            return 1;
        }else{
        return n*fac(n-1);
    }
    }
}
