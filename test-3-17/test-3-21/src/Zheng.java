import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-03-21
 * Time: 22:33
 */
import java.util.Arrays;

public class Zheng {
    public static void swap(int[] array, int[] array2) {
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            array[i] = array2[i];
            array2[i] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] array2= {5,6,7};
        swap(array,array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
