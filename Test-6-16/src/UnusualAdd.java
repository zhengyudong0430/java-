import java.util.*;

public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        int C = A^B;
        System.out.print("返回:");
        return C;
    }

    public static void main(String[] args) {
        UnusualAdd unusualAdd = new UnusualAdd();
        System.out.println(unusualAdd.addAB(-1, -2));
    }
}