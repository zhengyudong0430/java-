import java.util.Scanner;

public class String_question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        StringBuilder sb = new StringBuilder(str1);
        int j = 0;
        for(int i = 0; i < str1.length(); i++) {
            j++;
            char c = str1.charAt(i);
            if (str2.contains(c+"")) {
             j--;
            } else{
                sb.insert(j-1,c);
            }
        }
        System.out.println(sb);
    }
}
