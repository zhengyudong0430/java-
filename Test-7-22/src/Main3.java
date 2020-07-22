
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String []arr = new String[n];
            for(int i = 0; i<n; i++) {
                arr[i] = scanner.next();
            }
            String s = scanner.next();
            int m = scanner.nextInt();
            dic(arr,s,m);
        }
    }
    private static void dic( String[] arr, String s, int m) {
        int count = 0;
        List<Character> list1 = new ArrayList<>();
        for(int i = 0; i<s.length(); i++) {
            list1.add(s.charAt(i));
        }
    for(int i = 0; i<arr.length; i++) {
        String s1 = arr[i];
        List<Character> list2 = new ArrayList<>();
        for(int j = 0; j<s1.length(); j++ ) {
            list2.add(s1.charAt(j));
        }
        if((echo(list1,list2)==false)&&(s.length()==s1.length())) {
            Collections.sort(list1);
            Collections.sort(list2);
            if(echo(list1,list2)) {
                count++;
            }
        }

    }

        System.out.print(count);
        System.out.println(arr[m]);

        
    }

    private static boolean echo(List<Character> list1, List<Character> list2) {
        for(int i = 0; i<list1.size(); i++) {
            if(list1.get(i)!=list2.get(i)) {
                return false;
            }
        }
        return true;
    }
}
