import com.sun.javafx.geom.BaseBounds;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            process(str);
        }
    }

    private static void process(String str) {
        char []arr = str.toCharArray();
        for(int i = 0; i<arr.length; i++) {
            int  a = arr[i];
            StringBuilder stringBuilder = new StringBuilder(Integer.toBinaryString(a));
            if(stringBuilder.length()<8) {
               int len = 8-stringBuilder.length();
                for(int j = 0; j<len; j++ ) {
                    stringBuilder.insert(0,"0");
                }
            }
            int count = 0;
            for(int k = 0; k<stringBuilder.length(); k++) {
                if(stringBuilder.charAt(k)=='1') {
                    count++;
                }
            }
            if(count%2==0) {
                System.out.println("1" + stringBuilder.substring(1));
            }else {
                System.out.println(stringBuilder);
            }
        }
    }
}
