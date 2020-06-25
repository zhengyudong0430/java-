import java.util.*;

public class Gift {
    public static  int getValue(int[] gifts, int n) {
        // write code here
        Arrays.sort(gifts);
        if(gifts[n/2]==gifts[n/2-1]) {
            return gifts[gifts.length/2];
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,3,2};
        System.out.println(getValue(arr, 5));
    }
}