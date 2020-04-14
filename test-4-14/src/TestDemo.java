/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-14
 * Time: 15:20
 */
 class A<T> {
    T value;
    A(T value) {
        this.value=value;
    }
    T get() {
        return value;
    }
    void set(T value) {
        this.value = value;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        A<String> a = new A<String>("hello");
        String str = a.get();
        System.out.println(str);
       a.set("helloworld");
       str = a.get();
        System.out.println(str);

 }
}
