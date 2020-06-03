package text_0601;

import java.util.Scanner;

public class Drinkcup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int bottle = scanner.nextInt();
            if(bottle!=0) {
                System.out.println(drinkcup(bottle));
            }
        }
    }

    private static int  drinkcup(int n) {
        int cup = 0;
        while(n>=3) {
           if(n%3==0) {
               cup = cup +n/3;
               n = n/3;
           }
           if(n%3!=0) {
               cup = cup+n/3;
               n = n/3+n%3;
           }

       }
        if(n==2) {
            cup = cup + 1;
        }
        if(n<2) {
            cup = cup +0;
        }
        return cup;
    }


}
