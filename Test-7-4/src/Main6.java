import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            int id = s.lastIndexOf('\\');
            if (id != -1) {
                s = s.substring(id + 1);
            }
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> arg0, Map.Entry<String, Integer> arg1) {
                return (arg1.getValue() - arg0.getValue()) == 0 ? (arg0.getValue() - arg1.getValue()) : (arg1.getValue() - arg0.getValue());
            }
        });
        //只输出前8条
        int m = 0;
        for (Map.Entry<String, Integer> mapping : list) {
            m++;
            if (m <= 8) {
                String[] str = mapping.getKey().split(" ");
                String k = str[0].length() > 16 ? str[0].substring(str[0].length() - 16) : str[0];
                String n = str[1];
                System.out.println(k + " " + n + " " + mapping.getValue());
            } else {
                break;
            }
        }
    }}
