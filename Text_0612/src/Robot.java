import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        if(x==1||y==1) {
            return 1;
        }
    return countWays(x-1,y)+countWays(x,y-1);
    }

}