import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
       int  max = 0;
        String str1 = "";
        int end = str.length() - n;
        for (int i = 0; i <= end; i++) {
            String s = str.substring(i, i + n);
            if (GCRatio(s)>max) {
                str1 = s;
                max =  GCRatio(s);
            }
        }
        System.out.println(str1);
    }

    private static int  GCRatio(String str) {
        int con = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'G' || str.charAt(i) == 'C') {
                con++;
            }
        }

 return con;
    }
}