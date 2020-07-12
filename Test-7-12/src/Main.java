import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            char []a = scanner.nextLine().toCharArray();
            Map<Character,Integer> map = new HashMap<>();
            char c = 'A';
            while (c<='Z') {
                map.put(c,0);
                c++;
            }
         for(int i = 0; i<a.length; i++) {
                  char C = a[i];
                  if(C>='A'&&C<='Z') {
                      map.put(C,map.get(C)+1);
                  }

            }
            for (Map.Entry<Character,Integer> entry:map.entrySet()) {
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
}
