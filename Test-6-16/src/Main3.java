import javax.swing.*;
import java.math.BigInteger;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            int lenA = a.length();
            int lenB = b.length();
            int max = Math.max(lenA, lenB);
            int[] A = new int[max];
            int[] B = new int[max];
            for (int i = 0; i < lenA; i++) {
                A[i] = a.charAt(lenA - 1 - i) - '0';
            }
            for (int i = 0; i < lenB; i++) {
                B[i] = b.charAt(lenB - 1 - i) - '0';
            }
            int[] res = new int[max + 1];
            for (int i = 0; i < max; i++) {
                int sum = A[i] + B[i] + res[i];
                int tmp = sum / 10;
                res[i] = sum % 10;
                res[i + 1] += tmp;
            }
            for (int i = (res[max] == 0 ? 1 : 0); i < max + 1; i++) {
                System.out.print(res[max - i]);
            }
            System.out.println();
        }
    }
}