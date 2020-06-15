import java.util.*;
public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        char []arr = new char[10];
        arr = s1.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<10; i++) {
            list.add(0);
        }
        for(int i = 0; i<arr.length; i++) {
            list.set(arr[i]-'0',list.get(arr[i]-'0')+1);
        }
       for(int i = 0; i<list.size(); i++) {
       if(list.get(i)>0) {
           System.out.println(i+":"+list.get(i));
       }
        }
    }
}
