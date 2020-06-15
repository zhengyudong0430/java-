

public class Test6
{
    public static void add(Byte b)
    {
        b = b++;
    }
    public static void test()
    {
        Byte a = 127;
        Byte b = 127;
        add(a++);
        System.out.print(a + " ");
        add(b);
        System.out.println(b + "");
    }

    public static void main(String[] args) {
        test();
        int c=1;
        c = ++c;
        System.out.println(c);

    }
}
