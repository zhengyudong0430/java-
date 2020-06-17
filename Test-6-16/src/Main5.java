
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = new int[10];
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            for(int i = 0; i<10; i++) {
                arr[i] = scanner.nextInt();
            }
            for(int i = 1; i<10; i++) {
                while (arr[i]!=0) {
                    list.add(i);
                    arr[i]--;
                }
            }
            Collections.sort(list);
            System.out.print(list.get(0));
            while (arr[0]!=0) {
                System.out.print(0);
                arr[0]--;
            }
            for(int i = 1; i<list.size(); i++ ) {
                System.out.print(list.get(i));
            }

        }
        System.out.println();
    }
}
