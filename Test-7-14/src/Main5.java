import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            for(int i = 0; i<s.length(); i++) {
                String s1 = s.substring(0,i)+s.substring(i+1);
                boolean t = huiwen(s1);
                if(i==s.length()-1&&t==false) {
                    System.out.println("NO");
                }
                if(t==true) {
                    System.out.println("YES");
                    break;
                }
            }
        }
    }

    private static boolean huiwen(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
