import java.util.Scanner;
public class Zheng {
    public static void swap(Swap swap1,Swap swap2) {
        int tmp=swap1.num;
        swap1.num=swap2.num;
        swap2.num=tmp;
    }
    public static void main(String[] args){
      Swap swap1 = new Swap();
      swap1.num=10;
        Swap swap2 = new Swap();
      swap2.num=20;
        System.out.println(swap1.num+" "+swap2.num);
        swap(swap1,swap2 );
        System.out.println(swap1.num+" "+swap2.num);
       /*person person1=new person("小明", 15, "男");
        person1.show();
        person1.sleep();
        person1.eat();
        person person2=new person("小红", 16, "女");
        person2.show();
        person1.sleep();
        person1.eat();
        /*Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.sub(1,2));
        System.out.println(calculator.mol(1,2));
        System.out.println(calculator.div(1,2));*/

    }
}

