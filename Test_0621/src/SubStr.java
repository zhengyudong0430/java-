import java.util.*;

public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean []res = new boolean[n];
        for(int i = 0; i<n; i++) {
            if(s.contains(p[i])) {
                res[i] = true;
            }
        }
        return res;
    }
}