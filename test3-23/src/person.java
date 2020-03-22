public class person {
    private String name;
    private int age;
    private String sex;
    public person(String name,int age,String sex) {
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public void eat(){
        System.out.println(this.age+"岁的"+this.name+"在吃饭");
    }
    public void sleep(){
        System.out.println(this.age+"岁的"+this.name+"在睡觉");
    }
    public void show(){
        System.out.println("姓名: "+this.name+" 年龄: "+this.age+" 性别: "+this.sex);
    }
}
