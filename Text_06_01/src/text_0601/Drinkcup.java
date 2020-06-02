package text_0601;

import java.util.Scanner;

public class Drinkcup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int empty = scanner.nextInt();
         drinkcup(empty);
    }

    private static int  drinkcup(int n) {
        while (n<2) {
           return 0;
        }
    }


}
