import java.util.*;

public class Count2 {
    public static int countNumberOf2s(int n) {
        // write code here
        int count = 0;
        for(int i = 0; i<n; i++) {
            while (i>0) {
                if(i%10==2) {
                    count++;
                }
                i = i/10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOf2s(22));
    }
}