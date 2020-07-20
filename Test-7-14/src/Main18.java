
import java.util.Scanner;
public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String s1 = scanner.nextLine();
            jiami(s);
            jiemi(s1);
        }
    }
    private static void jiami(String s) {
        String str = "";
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c>='a'&&c<='y') {
                str += String.valueOf(((char)(c+1))).toUpperCase();
            }
            if(c>='A'&&c<='Y') {
                str += String.valueOf((char)((c+1))).toLowerCase();
            }
            if(c=='Z') {
                str += 'a';
            }
            if(c=='z') {
                str += 'A';
            }

            if(c>='0'&&c<='8') {
                str += String.valueOf((char)(c+1));
            }
            if(c=='9') {
                str += '0';
            }
        }
        System.out.println(str);
    }
    private static void jiemi(String s1) {
        String str = "";
        for(int i = 0; i<s1.length(); i++) {
            char c = s1.charAt(i);
            if(c>='b'&&c<='z') {
                str += String.valueOf(((char)(c-1))).toUpperCase();
            }
            if(c>='B'&&c<='Z') {
                str += String.valueOf((char)((c-1))).toLowerCase();
            }
            if(c=='A') {
                str += 'z';
            }
            if(c=='a') {
                str += 'Z';
            }

            if(c>='1'&&c<='9') {
                str += String.valueOf((char)(c-1));
            }
            if(c=='0') {
                str += '9';
            }
        }
        System.out.println(str);
    }


}

