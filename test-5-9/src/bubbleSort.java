/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-05-10
 * Time: 10:21
 */
public class bubbleSort {
    public static void bubbleSort( int []array) {
        for(int bound = 0;bound<array.length;bound++) {
            for(int cur = array.length-1;cur>bound;cur---) {
                if(array[cur-1]>array[cur]){
                    Swap(array,cur-1,cur);
                }
            }
        }
    }
public static void selectSort(int []array) {
        for(int bound = 0; bound<array.length;bound++) {
            for(int cur = bound;cur<array.length;cur++) {
                if(array[cur]<array[bound]) {
                    Swap(array,cur,bound);
                }
            }
        }
}
    private static void Swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
