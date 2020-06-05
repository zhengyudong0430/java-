import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Inteview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(1<=n&&n<=100) {
            System.out.println(Apple(n));
    }
    }

    private static int Apple(int n) {
        int sum = 0;
        int min = 0;
        for(int a = 0; a <= 6; a++) {
            for(int b= 0; b <= 8; b++) {
                if(6*a+8*b == n) {
                    sum = a+b;
                }if(min!=0) {
                    if(min>sum){
                        min = sum;
                    }
                    }else {
                    min = sum;
                }
                }
            if(min!=0) {
                return min;
            }
            }

        return -1;
        }


    }

