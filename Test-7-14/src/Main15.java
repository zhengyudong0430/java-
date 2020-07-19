import java.util.*;
public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int []arr = new int[n];
            Map<Integer,Integer> map = new HashMap<>();
            for(int i = 0; i<n; i++) {
                arr[i] = scanner.nextInt();
                int a = arr[i];
                if(!map.containsKey(a)) {
                    map.put(a,1);
                }else {
                    map.put(a,map.get(a)+1);
                }
            }
            List<Integer> list = new ArrayList<>();
            for(Map.Entry<Integer,Integer> mapping : map.entrySet()) {
                if(mapping.getValue()==1) {
                    list.add(mapping.getKey());
                }
            }
            Collections.sort(list);
            for(int i = 0; i<list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
