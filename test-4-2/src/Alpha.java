/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-01
 * Time: 22:02
 */
class Base{

    public Base(String s){

        System.out.print("B");

    }

}

public class Alpha  extends Base{

    public Alpha (String s) {
        super(s);


        System.out.print("D");

    }

    public static void main(String[] args){

        new Alpha("C");

    }

}