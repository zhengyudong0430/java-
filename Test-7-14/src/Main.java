import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //此处注意！！！若用Integer，会报数组越界等异常
       List<Long> list = new ArrayList<>();
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++) {
            int a = scanner.nextInt();
           long b = scanner.nextInt();
            if(a==1) {
                list.add(b);
            }else {
                list.remove(b);
            }
            if(isOk(list)) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    private static boolean isOk(List<Long> list) {
        int size = list.size();
        for(int i = 0; i<size; i++) {
            Long tmp = list.remove(i);
            int sum = 0;
            for(int j = 0; j<size-1; j++) {
                sum+=list.get(j);
            }
            if(sum<=tmp) {
                list.add(i,tmp);
                return false;
            }
                list.add(i,tmp);

        }
        return true;
    }
}
