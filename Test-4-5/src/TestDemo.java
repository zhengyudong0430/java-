/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-04
 * Time: 23:53
 */
class Money implements Cloneable{
    public int money = 19;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public int age;
    public Money m;
    public Person(int age) {
        this.age = age;
        m = new Money();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
    //alt+insert --》toString()

    //ctr+o     ==> Object的方法    可以自定义快捷键

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person1 = (Person) super.clone();
        person1.m = (Money) this.m.clone();
        return person1;
    }
}

public class TestDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(10);
        Person person1 = (Person) person.clone();

        System.out.println(person.m.money);//19
        System.out.println(person1.m.money);//19
        System.out.println("======================");
        person1.m.money = 99999;
        System.out.println(person.m.money);//
        System.out.println(person1.m.money);//
    }
}