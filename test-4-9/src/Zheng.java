/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-09
 * Time: 17:08
 */
public class Zheng {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
 System.out.println("before");
 arr = null;
 System.out.println(arr[100]);
 System.out.println("after");
        } catch (java.lang.NullPointerException e) {
 e.printStackTrace();
        }
        System.out.println("after try catch");

    }
    }
