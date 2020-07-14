import java.util.*;
public class Main1 {
    public static boolean isOk(List<Long> data){
        //算出data的总长度
        int len = data.size();
        //此循环判断是否任意len-1条边之和大于剩余一条边
        for (int i = 0; i < len; i++) {
            //取出data中的一个数
            long temp = data.remove(i);
            int sum = 0;
            //将剩余的数字全部相加
            for (int j = 0; j < len - 1; j++) {
                sum += data.get(j);
            }
            //判断若剩余数字之和小于data中的某一值，返回false
            if (sum <= temp) {
                //将临时变量加回去，这一步也可不加，都判断出来不满足构成多边形的条件了
                data.add(i, temp);
                return false;
            }
            //将临时变量加回去，再进行下一步的判定
            data.add(i, temp);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //此处注意！！！若用Integer，会报数组越界等异常
        List<Long> data = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            long b = sc.nextInt();
            if (a == 1){
                data.add(b);
            }else {
                data.remove(b);
            }
            if (isOk(data)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
}}
