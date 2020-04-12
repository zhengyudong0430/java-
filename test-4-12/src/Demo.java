import java.util.Map;
import java.util.HashMap;
import  java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-12
 * Time: 22:42
 */
public class Demo {
    public static  void main(String[] args) {
        Collection<String>list=new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add("你");
        list.add("好");
        list.add("你");
        System.out.println(list);
        list.remove("你");
        for(String s:list) {
            System.out.println(s);
        }
       list.clear();
        System.out.println(list.size());
        Map<String ,String> map = new  HashMap<>();
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.get("作者"));
        System.out.println(map.getOrDefault("作者", "佚名"));
        map.put("鲁迅","狂人日记");
        map.put("汪峰","怒放的生命");
        System.out.println(map);
        System.out.println(map.size());
        for(Map.Entry<String,String>entry:map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
