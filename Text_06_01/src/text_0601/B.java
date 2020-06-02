package text_0601;

class A {
    A(){
        System.out.println("A");
    }
}
public class B extends A{
    public static void main(String[] args) {
        new A();
        new B();
    }
}