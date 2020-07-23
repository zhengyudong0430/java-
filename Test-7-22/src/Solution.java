import java.util.Arrays;

public class Solution {
    public static int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int n = array[array.length/2];
        int count = 0;
        for(int i = 0; i<array.length; i++) {
            if(n==array[i]) {
                count++;
            }
        }
        if(count>array.length/2) {
            return n;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }
}