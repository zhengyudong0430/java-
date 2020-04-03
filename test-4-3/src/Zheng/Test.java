package Zheng;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-03
 * Time: 19:17
 */
 interface Shape {
    public  void draw() ;
        // 啥都不用干

}
class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}
class Rect implements Shape {
    @Override
    public void draw() {
        System.out.println("□");
    }
}
class Flower implements Shape {
    @Override
    public void draw() {
        System.out.println("♣");
    }
}
/////////////////////////////我是分割线//////////////////////
// Test.java
public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Flower();
        Shape shape2 = new Cycle();
        Shape shape3 = new Rect();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
    }
    // 打印单个图形
    public static void drawMap(Shape shape) {
        shape.draw();
    }
}