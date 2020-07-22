import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
      String s = "abc";
      String s1 = "bca";
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
       for(int i = 0; i<s.length(); i++) {
           list1.add(s.charAt(i));
           list1.add(s1.charAt(i));
       }
        Collections.sort(list1);
       Collections.sort(list2);
        System.out.println(list1==list2);
    }
}
