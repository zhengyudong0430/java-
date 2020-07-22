import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String A = scanner.next();
            String B = scanner.next();
            int []arrA = new int[26];
            int  []arrB = new int [26];
            for(int i = 0; i<A.length(); i++) {
                arrA[A.charAt(i)-'A']++;
            }
            for(int i = 0; i<B.length(); i++) {
                arrB[B.charAt(i)-'A']++;
            }
            int i = 0;
             for(; i<26; i++) {
                 if(arrA[i]<arrB[i]) {
                     System.out.println("No");
                     break;
                 }
             }
             if(i>=26) {
            System.out.println("Yes");
        }}
    }
}
