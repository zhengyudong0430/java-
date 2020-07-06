import java.util.*;
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            int id = s.lastIndexOf('\\');
            if(id!=-1) {
                s = s.substring(id+1);
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+1);
                }else{
                    map.put(s, 1);
                }

            }
        LinkedList<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue()<=0?o1.getValue():o2.getValue();
            }
        });
        int m = 0;
        for (Map.Entry<String,Integer> mapping: list) {
            m++;
            if(m<=8){
                String []str = mapping.getKey().split(" ");
                String filename = str[0].length()>16?str[0].substring(str[0].length()-16):str[0];
                String n = str[1];
                System.out.println(filename+" "+n+" "+mapping.getValue());
        }

    }
}}}
