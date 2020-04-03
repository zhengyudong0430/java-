/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-03
 * Time: 22:49
 */
class Animal {
        protected String name;
        public Animal(String name) {
            this.name = name;
        }
    }
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}
class cat  extends Animal implements IRunning{
    public cat(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }
}
class fish extends Animal implements IRunning,ISwimming{
    public fish(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游");
    }
}
class duck extends Animal implements IRunning,ISwimming,IFlying{
    public duck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"正在跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"正在游");
    }

    @Override
    public void fly() {
        System.out.println(this.name+"正在飞");
    }
}
public class TestDemo {

    public static void main(String[] args) {
        cat cat = new cat("花花");
        cat.run();
        fish fish = new fish("小鲤鱼") ;
        fish.run();
        fish.swim();
        duck duck = new duck("小鸭子");
        duck.run();
        duck.swim();
        duck.fly();
    }
}

