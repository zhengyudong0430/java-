import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String s1 = scanner.nextLine();
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i<s.length(); i++) {
                if(!s1.contains(String.valueOf(s.charAt(i)))) {
                    sb.append(s.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
