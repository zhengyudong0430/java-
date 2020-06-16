abstract class Animal{
    abstract void say();
}
class Cat extends Animal{
    @Override
    void say() {
        System.out.println();
    }

    public Cat(){
        System.out.printf("I am a cat");
    }
    public static void main(String[] args) {
        Cat cat=new Cat();
    }



}