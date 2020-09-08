import java.util.HashMap;
import java.util.Map;

public class Mian2 {
    public void Lilisi(int []arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for (Map.Entry<Integer,Integer>mapping:map.entrySet()) {
             if(mapping.getValue()!=1) {
                 System.out.println(mapping.getKey());
             }
        }
    }
}
