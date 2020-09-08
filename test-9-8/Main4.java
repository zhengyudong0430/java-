import java.util.Scanner;

public class Main4 {
    public static  int  mima(String str) {
        int len = str.length();
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt4 = 0;
        if(len>120||len<8) {
            return 1;
        }
        for(int i = 0; i<str.length();i++) {
            char c = str.charAt(i);
            if(c>='0'&&c<='9') {
                cnt1 = 1;
            }
            else if(c>='A'&&c<='Z') {
                cnt2 = 1;
            }
            else if(c>='a'&&c<='z') {
                cnt3 = 1;
            }else {
                cnt4 = 1;
            }
        }
     //   System.out.println(cnt1+cnt2+cnt3+cnt4);
        if(cnt1+cnt2+cnt3+cnt4!=4) {
            return 2;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(mima(str));
            }
        }
    }

