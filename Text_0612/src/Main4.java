import java.util.Scanner;

public class Main4 {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  str = "";
        String kong = " ";
        while(scanner.hasNext()) {
            str = scanner.nextLine();
            str = str+" "+scanner.nextLine();
            }
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i)==' ') {
               count++;
            }
        }
        System.out.println(count);
        }
    }
