package String;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-08
 * Time: 14:14
 */
public class TestDemo {

    public static void main(String[] args) {
       /* String str = "hello";
        String str1 = "Hello";
        System.out.println(str.equalsIgnoreCase(str1));
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");//6

            String str1 = "ac";
            String str2 = "AA";
            System.out.println("AA".compareTo(str2));
            System.out.println(str1.compareTo(str2));
            System.out.println(str2.compareTo(str1));
            //前小于后, 返回值小于 0
            //前大于后, 返回值大于 0
            //两者相等,返回值为 0*/
        String s1="A";
        String s2="a";
        System.out.println(s1.compareTo(s2));//前缀相同则比较长度，长度差-1
        String s3="abc";
        String s4="ae";
        System.out.println(s3.compareTo(s4));//只比较第一个不同的字符处b-e=-3
        String s5="abcdeg";
        String s6="acce";
        System.out.println(s5.compareTo(s6));//b-c=-1
        String s7="abc";
        String s8="abb";
        System.out.println(s7.compareTo(s8));//c-b=1
        String s9="abc";
        String s0="abaaaaaaaaaaaaa";
        System.out.println(s9.compareTo(s0));//c-a=2只比较第一个不同的字符处，与长度无关


        String sa="我";
        System.out.println(s9.compareTo(sa));//-2181因为是Unicode编码可以比较汉字

    }
}
