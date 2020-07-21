import java.util.Scanner;
public class Main25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            nameChange(str);
        }
    }
    private static void nameChange(String str) {
        String res = "";
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i)!='_') {
                res+=str.charAt(i);
            }
            else{
                res+=String.valueOf(str.charAt(i+1)).toUpperCase();
                i++;
            }
        }
        System.out.println(res);
    }
}
