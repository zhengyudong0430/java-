import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            scanner.hasNext();
            char []A = scanner.next().toCharArray();
            char []B = scanner.next().toCharArray();
            Map<Character,Integer> map = new HashMap<>();
            for(int i = 0; i<A.length;i++) {
               char c = A[i];
                if(!map.containsKey(c)){
                    map.put(c,1);
                }else {
                    map.put(c,map.get(c)+1);
                }
            }
            boolean flg = false;
            for(int i = 0; i<B.length; i++) {
                char c = B[i];
                 if(map.containsKey(c)) {
                    map.put(c,map.get(c)-1);
                }
                else if ((!map.containsKey(c))||(map.get(c)<=0)){
                    System.out.println("No");
                    flg = true;
                    break;
                }
            }
            if(!flg) {
            System.out.println("Yes");
        }}
    }
}
