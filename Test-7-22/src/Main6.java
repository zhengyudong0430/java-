import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String s = scanner.next();
            int n = scanner.nextInt();
             int start = 0;
            for(int i = s.length()-1; i>=0; i--) {
                if(s.charAt(i)=='\\') {
                    start = i;
                    break;
                }
            }
            s = s.substring(start+1);
            if(s.length()>16) {
                s = s.substring(s.length()-16);
            }
            s = s+" "+n;
            if(!map.containsKey(s)) {
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }
        for(Map.Entry<String,Integer> mapping:map.entrySet()) {
            System.out.println(mapping.getKey()+" "+mapping.getValue());
        }

    }
}
