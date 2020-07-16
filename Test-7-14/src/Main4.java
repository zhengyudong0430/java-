import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            char c = s.charAt(0);
            s = s+String.valueOf(c);
            int i = 0;
            int j = s.length()-1;
            int count = 0;
            while (i<j) {
                char start = s.charAt(i);
                char end = s.charAt(j);
                if(start==end) {
                    count++;
                }
                i++;
                j--;
            }
            if(count==s.length()/2) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
