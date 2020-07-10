import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().toUpperCase();
            String s1 = scanner.nextLine().toUpperCase();
            StringBuilder sb = new StringBuilder(s1);
            for(int i = 0; i< s.length(); i++) {
                if(!sb.toString().contains("s.charAt(i)")) {
                    
                }
            }
        }
    }
}
