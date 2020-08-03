import java.util.Scanner;
public class Main12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String str1 = "";
            //int count = 0;
            String ret = "";
            for (int i = 0; i < str.length(); i++) {
                char ch1 = str.charAt(i);
                if (ch1 >= '0' && ch1 <= '9') {
                    str1 = str1 + ch1;
                }else {
                    str1  = "";
                }
                if (ret.length() < str1.length()) {
                    ret = str1;
                }
            }
            System.out.println(ret);
        }
    }
}