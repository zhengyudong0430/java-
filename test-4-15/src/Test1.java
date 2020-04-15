/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-15
 * Time: 13:55
 */
public class Test1 {
    public static void main(String[] args)
    {
        Object o = new Object()
        {
        public boolean equals(Object obj)
        {
            return true;
        }
    };
    System.out.println(o.equals("Fred"));
    }
}