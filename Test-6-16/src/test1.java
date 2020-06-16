public class test1 {
    public static void complicatedexpression_r(){
        int x=20, y=30;
        boolean b;
        b = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
        System.out.println(b);
    }

    public static void main(String[] args) {
        complicatedexpression_r();
    }
}
