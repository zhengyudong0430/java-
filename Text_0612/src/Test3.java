public class Test3 {

    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.start();
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pong");
    }

}
