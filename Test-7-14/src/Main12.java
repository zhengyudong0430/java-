import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
           int x = 0;
           int y = 0;
           String []s = scanner.nextLine().split(";");
           for(int i = 0; i<s.length; i++) {
               if ( (s[i].length() == 3 && ( (s[i].charAt(0) == 'A' || s[i].charAt(0) == 'S' || s[i].charAt(0) == 'W' || s[i].charAt(0) == 'D') &&
                       ( s[i].charAt(1) >= '0' && s[i].charAt(1) <= '9') && ( s[i].charAt(2) >= '0' && s[i].charAt(2) <= '9' ) )) ||
                       ( s[i].length() == 2 && ( (s[i].charAt(0) == 'A' || s[i].charAt(0) == 'S' || s[i].charAt(0) == 'W' || s[i].charAt(0) == 'D') &&
                               ( s[i].charAt(1) >= '0' && s[i].charAt(1) <= '9') ) ) )
               {
                    if(s[i].charAt(0)=='A') {
                     x -= Integer.valueOf(s[i].substring(1));
                    }if(s[i].charAt(0)=='D') {
                        x += Integer.valueOf(s[i].substring(1));
                    }if(s[i].charAt(0)=='W') {
                        y += Integer.valueOf(s[i].substring(1));
                    }if(s[i].charAt(0)=='S') {
                        y -= Integer.valueOf(s[i].substring(1));
                    }
                }
           }
            System.out.println(x+","+y);

        }
    }
}
