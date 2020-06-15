public class Test7 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he"+new String("llo");
        System.err.println(str1==str2);
    }
}
