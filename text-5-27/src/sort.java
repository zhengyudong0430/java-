import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-05-27
 * Time: 21:38
 */
public class sort {
     public static void sort(int []array) {
         for(int bound = 0;bound<array.length;bound++) {
             for(int cur = bound;cur<array.length-1;cur++) {
                 if(array[cur-1]>array[cur]) {
                     swap(array,cur-1,cur) ;
                 }
             }
         }
     }

    private static void swap(int[] array, int i, int j) {
         int tmp = array[i];
         array[i] = array[j];
         array[j] = tmp;
    }
    public static void main(){
         int []array = {4,2,8,5,1,9,0,6};
         sort(array);
        System.out.println(Arrays.toString(array));
    }
}
