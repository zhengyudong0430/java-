import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String []arr = new String[n];
            for(int i = 0; i<n; i++) {
                arr[i] = scanner.next();
            }
            String s = scanner.next();
            int m = scanner.nextInt();
            dic(arr,s,m);
        }
    }

    private static void dic( String[] arr, String s, int m) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
           String s1 = arr[i];
           if(s1.length() == s.length()) {
               int n = 0;
               for(int j=0; j<s.length(); j++) {
                   if(s.charAt(j)!=s1.charAt(j)) {
                       n++;
                   }
               }
               if(n>=2) {
                   count++;
               }
           }
        }
        System.out.println(count);
        System.out.println(arr[m]);
    }
}
