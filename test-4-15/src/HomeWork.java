import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-15
 * Time: 17:12
 */
public class HomeWork {
    public static void main(String[] args){
        /*Scanner scanner =new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                char s = str.charAt(i);
                if (!buffer.toString().contains(s+"")) {
                    buffer.append(s);
                }
            }
            System.out.println(buffer);
        }*/
        String  str = new String("hello");
        char s='e';
        System.out.println(str.contains(s+""));

    }
}