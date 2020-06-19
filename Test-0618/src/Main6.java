import java.util.*;

public class Main6 {
   static List<String> list = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            list.clear();
            int n = scanner.nextInt();
            int []arr = new int[n];
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i<n; i++) {
                arr[i] = scanner.nextInt();
            }
            trainOut(arr,0,stack,"", 0);
            Collections.sort(list);
            for (String str:list
                 ) {
                System.out.println(str);
            }
        }
    }

    private static void trainOut(int[] arr, int i, Stack<Integer> stack, String str, int n) {

        if(n==arr.length) {
            list.add(str);
        }
        while (!stack.empty()) {
            int tmp = stack.pop();
            trainOut(arr,i,stack,tmp+" ",n+1);
            stack.push(tmp);
        }
        if(i<arr.length) {
            stack.push(arr[i]);
            trainOut(arr,i+1,stack,str,n);
            stack.pop();

        }

    }
}
