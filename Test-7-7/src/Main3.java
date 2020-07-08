import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = scanner.nextInt();
            int win = 0;
            int lose = 0;
            int draw = 0;
            Map<String,Integer> map = new HashMap<>();
            for(int i = 0; i<n; i++) {
                String []a = scanner.nextLine().split(" ");
                if(a[0].equals("C")&&a[1].equals("J")) {
                    win++;
                    if(map.containsKey("C")) {
                        map.put("C",map.get("C")+1);
                    }else{
                        map.put("C",1);
                    }
                }
                if(a[0].equals("J")&&a[1].equals("B")) {
                    win++;
                    if(map.containsKey("J")) {
                        map.put("J",map.get("J")+1);
                    }else{
                        map.put("J",1);
                    }
                }
                if(a[0].equals("B")&&a[1].equals("C")) {
                    win++;
                    if(map.containsKey("B")) {
                        map.put("B",map.get("B")+1);
                    }else{
                        map.put("B",1);
                    }
                }if((a[0].equals("B")&&a[1].equals("B"))||(a[0].equals("C")&&a[1].equals("C"))||a[0].equals("J")&&a[1].equals("J")) {
                    draw++;
                }
            }
            lose = n-win-draw;
            for (map:m
                 ) {

            }
            System.out.println(win+" "+lose+" "+draw);

        }
    }
}
