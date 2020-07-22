import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String []strs = new String[n];
            for(int i = 0; i<n; i++) {
                strs[i] = scanner.next();
            }
            String s = scanner.next();
            int k = scanner.nextInt();
            process(strs,s,k);
        }
    }

    private static void process(String[] strs, String s, int k) {
        List<String> list = new ArrayList<>();
        Arrays.sort(strs);
        for(String str : strs) {
            if(isBrother(str,s)) {
                list.add(str);
            }
        }
        System.out.println(list.size());
        if(k<=list.size()&&!list.isEmpty()) {
            System.out.println(list.get(k-1));
        }
    }

    private static boolean isBrother(String str, String s) {
        if(s.equals(str)) {
            return false;
        }
        if(s.length()!=str.length()) {
            return false;
        }
        char []c1 = s.toCharArray();
        char []c2 = str.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
