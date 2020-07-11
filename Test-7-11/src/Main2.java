import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            char []a = scanner.nextLine().toUpperCase().toCharArray();
            String s = scanner.nextLine().toUpperCase();
            List<Character> list = new LinkedList<>();
            for(int i = 0; i<a.length; i++) {
                String c = String.valueOf(a[i]);
                if(!s.contains(c)) {
                    if(!list.contains(a[i])){
                    list.add(a[i]);
                }}
            }
            for (int i = 0; i<list.size(); i++) {
                System.out.print(list.get(i));
            }
        }
    }
}
