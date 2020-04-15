/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-15
 * Time: 16:27
 */
public class Test2{
    public static void main(String[] args) {
        String sb = new String();
        sb = "aa bb cc";
        String[] sc = sb.split(" ");
       for(String s  :sc) {
           System.out.println(s);
       }

        /*StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append("java");
        System.out.println(sb);
        func(sb);
        System.out.println(sb);
    }

    public static StringBuffer func(StringBuffer tp) {
        tp.append("\n").append("www.bb.com");
        return tp;*/
    }
}