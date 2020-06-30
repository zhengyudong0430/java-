import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            Map<String,Integer> map = new LinkedHashMap<>();
            for(int i = 0; i<m; i++) {
                map.put(scanner.next(),0);
            }
            int n = scanner.nextInt();
            int Invalid = 0;
            for(int i = 0; i<n; i++) {
                String s = scanner.next();
                if(map.get(s)==null) {
                    Invalid++;
                }else{
                    map.put(s,map.get(s)+1);
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("Invalid : " + Invalid);

        }
    }
}
